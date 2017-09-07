//问题：找出数组中，出现次数超过n/3次的所有元素。
class Solution229 {
    //用排序后找相同的做法，很简单。
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=n-1;i>=n/3;i--){
            if(nums[i]==nums[i-n/3]) {
                if(!list.contains(nums[i])) list.add(nums[i]);
            }
        }
        return list;
    }
}