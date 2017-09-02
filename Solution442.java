//问题：一个长度为n的数组，存有1-n的数，有的数出现了两次，返回那些出现两次的数。
class Solution442 {
    //以前做过类似的，标记法，因为1-n的数，所以每一个出现过一次的数把他的索引记为负数，再次有索引负数的出现的时候代表这个数出现了两次。
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int index =Math.abs(nums[i])-1;
            if(nums[index]<0)
                list.add(Math.abs(nums[i]));
            nums[index]=-nums[index];
        }
        return list;
    }
}