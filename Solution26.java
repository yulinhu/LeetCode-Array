//问题：一个有序的数组，把不重复的数字放在数组前面。
class Solution26{
  //已排序，所以只用对比之前一个元素的值。
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int j=1;
       for(int i=1;i<nums.length;i++){
           if(nums[i]!=nums[i-1]) nums[j++]=nums[i];
       }
        return j;
        
    }
    // public static void exch(int[] num,int a,int b){
    //     int temp=num[a];
    //     num[a]=num[b];
    //     num[b]=temp;
    // }
}