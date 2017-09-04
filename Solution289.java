//问题：一个二元数组。相当于细胞：存活用1表示，死亡用0表示。一个细胞周围有八个，若有2个一下存活的邻居，则死亡；若有3个以上存活的邻居，死亡。死亡的细胞周围若有3个邻居
//存活，则复活。这个方法用于迭代。
class Solution289{ 
    //很简单，不说了。
    public void gameOfLife(int[][] board) {
        int[][] newbo=new int[board.length][board[0].length];
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                newbo[i][j]=board[i][j];
            }
         }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(newbo[i][j]==0){
                    if(getCount(newbo,i,j)==3) board[i][j]=1;
                }
                if(newbo[i][j]==1){
                    if(getCount(newbo,i,j)<2||getCount(newbo,i,j)>3) board[i][j]=0;
                    
                }
            }
        }
    }
    public  static int getCount(int[][] boa,int i,int j){
        int count=0;
        int[] plus={-1,0,1};
        for(int ip:plus){
            for(int jp:plus){
                if(ip==0&&jp==0) continue;
            if(isExist(boa,i+ip,j+jp)){
                if(boa[i+ip][j+jp]==1) count++;
            }
               }
              }
               return count;
               }
              
    public static boolean isExist(int[][] boa,int i,int j){
        if(i>=0&&j>=0&&i<boa.length&&j<boa[0].length) return true;
        return false;
    }
    
}   