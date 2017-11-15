//问题：一个数组以，0，1，2组成，排序。
class Solution75 {
    //不用自带的排序算法，因为只有三种元素，每次遇到0.放前面，遇到2，放后面。要注意在和后面换位后要下标减1来重新遍历缓过来的这个数。
    public void sortColors(int[] nums) {
        int r=nums.length-1,l=0;
            for(int i=0;i<=r;i++){
                if(nums[i]==0) swap(nums,i,l++);
                if(nums[i]==2) {
                    swap(nums,i,r--);
                    i--;
            }
               
    }
    }
    public static void swap(int[] num,int i,int j){
        int temp=num[i];
            num[i]=num[j];
            num[j]=temp;
    }
}