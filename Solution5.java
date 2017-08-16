// 问题：把一个长度为2n的数组分成n个两两组合的数组（a，b）（a1，b1），并输出最大的sum=min（a,b)+min(a1,b1)+...+
// 这道题很简单，把数组排序就行了。
public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-1;i+=2){
            sum=sum+Math.min(nums[i],nums[i+1]);
        }
        return sum;
        
    }
}