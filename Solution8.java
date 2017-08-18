//问题：在一个长度为n的数组中，存在1-n的整数，有的整数出现了两遍，有的没出现。
//要求在o（n）时间内，不用多余的空间。
class Solution {
    /*开始想不出来怎么做
    假设1-n都出现过，那么索引n-1上对应的就是n，我们把数组中的每一个出现的数的索引上的数取负数。若一个索引a上的数不是负数，说明没有a+1；
    */  

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<Integer>();
        for(int num:nums){
            int index=Math.abs(num)-1;
            nums[index]=(nums[index]>0?-nums[index]:nums[index]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        
        return list;
        
    }
}