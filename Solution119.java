//问题：输入k，打印帕斯卡三角的第k行
class Solution119 {
	//若运用杨辉三角的性质，容易数字溢出。用迭代的方法，用i-1行来算第i行。
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> retri=new ArrayList<Integer>();
        retri.add(1);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> tri =new ArrayList<Integer>();
            tri.add(1);
            for(int j=1;j<i;j++){
                tri.add(retri.get(j-1)+retri.get(j));
            }
            tri.add(1);
            retri=tri;
        }
        return retri;
        
        
    }
}