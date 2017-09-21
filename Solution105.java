/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//问题：知道前序和中序遍历，求二叉树。
class Solution105 {
    //还是一样的求法，把中序的数存入map，前序的第一个元素是根节点。然后分出左右子树。
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||inorder==null||preorder.length==0||inorder.length==0)
            return null;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return inPre(inorder,0,inorder.length,preorder,0,preorder.length-1,map);
    }
    public TreeNode inPre(int[] in,int ni,int nj,int[] pr,int pi,int pj,HashMap<Integer,Integer> map){
        if(ni>nj||pi>pj) return null;
        TreeNode root=new TreeNode(pr[pi]);
        int index=map.get(pr[pi]);
        root.left=inPre(in,ni,index-1,pr,pi+1,pi+index-ni,map);
        root.right=inPre(in,index+1,nj,pr,pi+index-ni+1,pj,map);
        return root;
    }
}