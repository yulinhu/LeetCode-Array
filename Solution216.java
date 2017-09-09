//问题：一个数n，一个数k。从1-9中，选出k个数，加起来等于n。返回所有组合。
class Solution216{
    //反向回溯算法，掌握还不熟练，感觉也挺暴力的。
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        combination(res,new ArrayList<Integer>(),k,1,n);
        return res;
    }
    public static void combination(List<List<Integer>> res,List<Integer> com,int k,int start,int n){
        if(com.size()==k&&n==0){
            List<Integer> list= new ArrayList<Integer>(com);
            res.add(list);
            return;
        }
        for(int i=start;i<=9;i++){
            com.add(i);
            combination(res,com,k,i+1,n-i);
            com.remove(com.size()-1);
        }
    }
}