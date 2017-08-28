//问题：一个数组，一个数字。把和数字相同的元素放到数组末尾。
class Solution27 {
    //就是把数字相同的元素放到末尾
    public int removeElement(int[] nums, int val) {
        int a=nums.length;
        for(int i=nums.length-1,j=nums.length-1;i>=0;i--){
            if(nums[i]==val) {
                exch(nums,i,j);
                j--;
                a--;
            }
        }
        return a;
    }
    public static void exch(int[] num,int a,int b){
        int temp=num[a];
        num[a]=num[b];
        num[b]=temp;
        
    } 
}