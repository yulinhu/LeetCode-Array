/* 
	问题：把数组中的0都移到数组的尾部，非零元素的相对位置保持不变
*/
class Solution {
	/*
		找到第count个非零元素，把它和第count个位置换位置，0会换到后面
	*/
    public void moveZeroes(int[] nums) {
        
        for(int count=0,num=0;num<nums.length;num++){
            if(nums[num]!=0){
                swap(nums,count++,num);
            }
        }
    }
    public static void swap(int[] n,int a, int b){
        int temp=0;
        temp=n[a];
        n[a]=n[b];
        n[b]=temp;
        
    }
}