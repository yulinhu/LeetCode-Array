//问题：一个三角形二维list，每个元素为数字，从顶走到底，只能走下一行的相邻元素，问最短路径。
class Solution120{
	//动态规划问题：从后往前，把每一个数的后面最短路径一一标记，向前迭代。
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] a=new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<i+1;j++){
                a[j]=Math.min(a[j],a[j+1])+triangle.get(i).get(j);
            }
        }
        
        return a[0];
    }
}