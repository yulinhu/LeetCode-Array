//问题：若数组中有重复的数字，返回true。若没有 返回false
class Solution217 {
	//很简单，放入set，每次放之前检查是不是存在此元素，若存在，返回true。
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}