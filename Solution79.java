//给一个char[][] ，给一个word， 问能不能在char[][]中画一条路径使其匹配word.
class Solution79{
    //首先把word也换成char[]，再用递归的方法。
    public boolean exist(char[][] board, String word) {
        char[] wor=word.toCharArray();
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
              if(exist(board,i,j,wor,0)) return true;
            }
        }
        
return false;
    }
    public static boolean exist(char[][] board,int i,int j,char[] wor,int a){
        if(a==wor.length) return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length) return false;
        if(board[i][j]!=wor[a]) return false;
        board[i][j]^=256;
        boolean exist=exist(board,i+1,j,wor,a+1)||
                       (exist(board,i-1,j,wor,a+1))||
                        (exist(board,i,j+1,wor,a+1))||
                         (exist(board,i,j-1,wor,a+1)) ;
        board[i][j]^=256;
                          return exist;
    }
}