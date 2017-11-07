//问题：找出最长的连续增长子串长度
class Solution 674{
    //一个计数器，遇到不增长的时候归零。
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0||nums==null) return 0;
        int count=1,max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            max=Math.max(max,count);
            }
            else{
            count=1;
            }
        }
        return max;
       
    }
}


public int method2(int[] nums){
    //记录每次不增长的位置，也就是下一个增长序列的开始元素，然后用当前的位置减去这个
     int mar=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i-1]>=nums[i]) mar=i;
            ans=Math.max(ans,i-mar+1);
        }
        return ans;
}