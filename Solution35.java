//问题：一个有序的数组，给一个数k。返回k在数组中的索引，若不存在k，则返回插入k后k的索引。
class Solution35 {
    //有序数组当然是用二分法啦
    public int searchInsert(int[] nums, int target) {
        int lo=0,hi=nums.length-1,mid=(lo+hi)/2;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target) hi=mid-1;
            if(nums[mid]<target) lo=mid+1;
            
            }
        
        
        return lo;
        
    }
}