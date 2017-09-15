//问题：一个有序数组，移动了n步（n未知），例子{3，4，5，6，1，2}，求最小的数。
class Solution153 {
    //也是有序数组，就用二分法。
    public int findMin(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(nums[mid]<nums[hi]) hi=mid;
            else lo=mid+1;
        }
        return nums[lo];
    }
}