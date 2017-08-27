//问题：一个数组，从左至右每个元素代表同一个数字的从大到小的位数。 要求：把这个数字加一，同样返回一个一样格式的数组。
class Solution66{
    //开始总想着通过10的指数来做，但是总是数值溢出。其实应该一位一位加，若小于9，直接加以返回，若为9，则为0，计算上一位数，直到第一位数，加一个1。
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] res =new int[len+1];
            res[0]=1;
            return res;
    }
}