//这道题非常简单，首先判定这个数组是不是能放在r*c的矩阵中（元素数目不同就不行）然后再吧拆开的元素依次放入新的二元数组中就可以了。
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[] sum=new int[nums.length*nums[0].length];
        int a=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                sum[a]=nums[i][j];
                a++;
            }
            
        }
        if(r*c!=sum.length||nums.length==0) return nums;
        int b=0;
        int[][] reshape=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                reshape[i][j]=sum[b];
                b++;
            }
        }
        
        return reshape;
    }
}