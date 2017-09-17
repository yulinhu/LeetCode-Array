//问题：一个数字，调换一次里面两个位数的位置，稳这个数变得最大是多少。
class Solution670 {
    //我想的是模仿选择排序法，把最大的数放到前面。但是要从后遍历，因为越后面的数放到前面数越大。
    public int maximumSwap(int num) {
        String snum1=String.valueOf(num);
        int[] snum2=new int[snum1.length()];
        for(int i=0;i<snum2.length;i++){
            snum2[i]=Integer.parseInt(String.valueOf(snum1.charAt(i)));
        }
        
        for(int i=0;i<snum2.length;i++){
            int max=snum2[i];
            int index=i;
            for(int j=snum2.length-1;j>=i;j--){
            if(snum2[j]>max){
                index=j;
                max=snum2[j];
            }
            }
            if(index==i) continue;
            else {
                swap(snum2,i,index);
                  break;
                 }
        }
        int r=0;
        for(int i=0;i<snum2.length;i++){
            r=r*10+snum2[i];
        }
        return r;
        
    }
    public static void swap(int[] num,int a,int b){
        int temp=num[a];
        num[a]=num[b];
        num[b]=temp;
    }
}
class Solution{
    //贪心算法
    public int maximumSwap(int num){
        Char[] A =String.toString(num).toCharArray();
        int last[]=new int[10];
        for(int i=0;i<A.length;i++){
            last[A[i]-'0']=i;   //把数字在的最后的位数记录
        }
        for(int i=0;i<A.length;i++){
            for(int j=9;j>A[i]-'0';j--){
                if(last[j]>i){  //当有比A[i]大的数在后面时
                    swap(A,i,last[j]);
                    return Integer.valueOf(new String(A));
                }
            }
        }
    }
}