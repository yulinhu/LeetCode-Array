//问题：一个数组，相邻的数都不同，找到这个数组的峰值，若有很多峰值，则任意一个就行。峰值指比两边都大。
class Solution162{
    //要求log时间，肯定要用二分法，因为默认nums[-1]和nums[length]都是负无穷，所以只用找到一个值比两边都大就行了。
    public int findPeakElement(int[] nums) {
        int lo=0,hi=nums.length-1;
        int mid =0;
        while(lo<hi){
            mid=(lo+hi)/2;
            if(nums[mid]>nums[mid+1]){
                hi=mid;
            }else{
                lo=mid+1;
            }
        }
    return lo;

    
        
    }
     // static int serch(int[] nums,int lo,int hi){
     //    if(lo==hi) return lo;
     //     int mid =(lo+hi)/2;
     //    while(lo<=hi){
     //    mid =(lo+hi)/2;
     //    if(nums[mid]>nums[mid+1]) return serch(nums,lo,mid);
     //        else return serch(nums,mid+1,hi);
     //    }
     //     return mid;
    //}
    
}