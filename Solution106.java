/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//问题：知道中序和后序遍历，构造二叉树。
class Solution {
    //基本思想：后序的最后一个为根节点，然后从中序中找到左右子树，继续找根节点。
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||postorder==null||inorder.length==0||postorder.length==0){
            return null;
        }
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();//把中序存入map中，方便索引。
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return inpost(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }
    public TreeNode inpost(int[] in,int ni,int nj,int[] po,int pi,int pj,HashMap<Integer,Integer> map){
        if(ni>nj||pi>pj) return null;//迭代条件。
        TreeNode root=new TreeNode(po[pj]);//根节点
        int index =map.get(po[pj]);//找到中序中的索引
        root.left=inpost(in,ni,index-1,po,pi,pi+(index-ni-1),map);//左子树
        root.right=inpost(in,index+1,nj,po,pi+(index-ni),pj-1,map);//右子树
        return root;
    } 
    
}