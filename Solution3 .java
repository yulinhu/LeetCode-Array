//利用排序的方法，第一个和排序后数组不同的数肯定是排序过的，最后一个不同的数肯定也是进行了排序。这两个数中间就是子数组。

public class Solution3 {
    public int findUnsortedSubarray(int[] nums) {
        int[] so=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            so[i]=nums[i];
        }
        Arrays.sort(so);
        int a=0;
        int b=nums.length-1;
        for(int i=0;i<nums.length;i++){
            a=i;
            if(so[i]!=nums[i]) break;
                
        }
        for(int j=nums.length-1;j>=0;j--){
            b=j;
            if(so[j]!=nums[j]) break;
            
            }
        if(b<=a) return 0;
        else return b-a+1;
    }
}


//利用栈的方法，若压入栈数比下一个待入栈的大时，是第一个无序数，从后往前压，压入栈数比下一个待入栈的小时，是最后一个无序数。
public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        int l = nums.length, r = 0;
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty()&&nums[stack.peek()]>nums[i])
                  l=Math.min(l,stack.pop());
                  stack.push(i);
                  }
                  stack.clear();
        for(int j=nums.length-1;j>=0;j--){
            while(!stack.isEmpty()&&(nums[stack.peek()]<nums[j]))
                  r=Math.max(r,stack.pop());
                  stack.push(j);
    }
                  return r>l?r-l+1:0;
              }         
}