//问题：设一个长度为n的数组，里面有一个数字出现次数大于n/2，找出这个数字。
class Solution169 {
	//排序后，中间的数字就是要找的数。
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length)/2];
        
        
    }
}