//问题：给定数组nums，整数k。加起来和大于k的最短子串长度为几。
class Solution209 {
    //双指针。
    public int minSubArrayLen(int s, int[] nums) {
        int sum=0;
        int left=0;
        int ans=nums.length+1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=s){
                ans=Math.min(ans,i+1-left);
                sum=sum-nums[left++];
            }
        }
        return (ans==nums.length+1)?0:ans;
    }
    
}