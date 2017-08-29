class Solution661 {
    public int[][] imageSmoother(int[][] M) {
        if(M==null) return null;
        int row=M.length;
        int col=M[0].length;
        if(row==0) return new int[0][];
        int[][] re=new int[row][col];
        
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                int count=0;
                int sum=0;
                for(int h:new int[]{-1,0,1}){
                    for(int s:new int[]{-1,0,1}){
                        if(isValue(i+h,j+s,row,col)){
                            count++;
                            sum+=M[i+h][j+s];
                        }
                    }
                }
                re[i][j]=sum/count;
            }
        }
        return re;
        
    }
    public static boolean isValue(int x,int y,int row,int col){
        if(x>=0&&x<row&&y>=0&&y<col) return true;
        return false;
    }
}