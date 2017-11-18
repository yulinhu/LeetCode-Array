//问题：有一个二维数组，把每个0元素所在的行和列都变成0。要求不用额外空间。
class Solution73{
      //每次遇到0元素，就把0元素的最上面和最左边的元素设置为0，作为标记。但是要注意（0，0）这个点，所以要记录是第一列还是第一行的元素使这个元素为0，标记。
    public void setZeroes(int[][] matrix) {
        int row=matrix.length,col=matrix[0].length;
        boolean fr=false,fc=false;
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if(matrix[i][j]==0){
                   if(i==0) fr=true;
                   if(j==0) fc=true;
                   matrix[0][j]=0;
                   matrix[i][0]=0;
               }
           }
       }
       for(int i=1;i<row;i++){
           for(int j=1;j<col;j++){
                if(matrix[0][j]==0||matrix[i][0]==0)
                    matrix[i][j]=0;
           }
       }
        if(fr==true){
            for(int j=0;j<col;j++){
                matrix[0][j]=0;
            }
        }
          if(fc==true){
            for(int i=0;i<row;i++){
                matrix[i][0]=0;
            }
        }
    }
}