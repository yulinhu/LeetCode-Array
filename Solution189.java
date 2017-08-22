//问题：把数组元素向后循环移动k位。
class Solution189 {
	//从第一个数开始，把start放入后k个位置，再把这个位置的数放入后k个位置。类推。
    public void rotate(int[] nums, int k) {
       int n=nums.length,a=k%n;
        int count=0;
        for(int start=0;count<n;start++){
            int prev=nums[start];
            int current=start;
            do{
                int next=(current+a)%n;
                int temp=nums[next];
                nums[next]=prev;
                prev=temp;
                current=next;
                count++; 
            }while(current!=start);
        }
    }
}