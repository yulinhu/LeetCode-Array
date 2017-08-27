//问题：找出一个数组中，和最大的一个子数组。
class Solution53 {
    //用dp的算法。
    public int maxSubArray(int[] nums) {
       int sum=0;
        int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           sum+=nums[i];
           max=Math.max(max,sum);
           sum=Math.max(sum,0);
       }
        return max;
        
        
        
        
    }
}