//问题：给一个数字k，构造一个k层的杨辉三角。
class Solution118s{
	//先构造一个上一行list，一个本行list，利用上一行list求这一行list。
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(numRows==0) return list;
        List<Integer> relist=new ArrayList<Integer>();
        relist.add(1);
        
        list.add(relist);
       
        for(int i=1;i<numRows;i++){
        List<Integer> listi=new ArrayList<Integer>();
            listi.add(1);
            for(int j=1;j<i;j++){
                listi.add(relist.get(j-1)+relist.get(j));
                
            }
            listi.add(1);
            
            list.add(listi);
            relist=listi;
        
        }
        return list;
    }
}