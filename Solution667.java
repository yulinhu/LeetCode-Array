//问题：输入两个数 n 和k   输出一个长度为n的数组，里面包含1-n的所有数。且相邻两个数的差值有k种。
//例：n=3 ,k=1 [1,2,3]   n=3,k=2  [1,3,2]
class Solution667 {
    //如果从1-n个数中，一个最左一个最右交替写进数组，会保证每一个差值都不一样。每次多一种差值，k--。当k==1的时候，后续数组保持差值一样（1）就行。
    //需要注意：要根据k的奇偶来判断第一个数从左边输入还是右边。否则k=1的时候依次输入i++，会多一个差值。
    public int[] constructArray(int n, int k) {
        int[] re=new int[n];
        int i=1,j=n;
        for(int a=0;i<=j;a++){
            if(k==1) re[a]=i++;
            else{
            re[a]=k--%2!=0?i++:j--;
                
            }
            
            
        }
        return re;
        
    }
}