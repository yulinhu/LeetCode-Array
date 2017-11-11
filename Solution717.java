//问题：有两个特征，一个特征用0表示，一个特征用10或11表示，问一个数组最后一个特征是不是第一种特征
class Solution717{
    //从头开始遍历，如果是1开头是特征2，如果是0开头是特征1，跳过这个特征，一直到最后，如果留了一个特征，就是特征1
    public boolean isOneBitCharacter(int[] bits) {
        int i= 0;
        while(i<bits.length){
             if(i==bits.length-1) return true;
            if(bits[i]==0){
                i++;
            }else{
                i=i+2;
            }
        }
        return false;
    }
}