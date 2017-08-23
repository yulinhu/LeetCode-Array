//问题：给一个有序数组，一个数字k。找到数组中加起来等于k的两个数，返回他们是第几个数。
class Solution167 {
    //因为是有序数组，可以想到二分查找。但是这样复杂度大。所以用双指针！
    public int[] twoSum(int[] numbers, int target) {
        int[] index=new int[2];
        int a=0;
        int b=numbers.length-1;
        while(a<b){
            if(numbers[a]+numbers[b]==target) {
                index[0]=a+1;
                index[1]=b+1;
                return index;
            }
            else if(numbers[a]+numbers[b]<target) a++;
            else b--;
            
        }
       
        
       
        return null;
       
    }
}