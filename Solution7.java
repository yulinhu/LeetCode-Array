//这道题要求在一个二进制的数组中，找到最长的连续的1组成的子串的长度
//很简单，遍历数组，设置一个记录数组的int i，一个记录最大长度的int max。遇到1，i++。遇到0重置i=0；
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int a=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                a++;
            }
            else {
                a=0;
            }
            max=Math.max(max,a);
            
        }
        return max;
    }
}