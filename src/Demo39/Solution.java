package Demo39;

/**
 * Created by yan on 2016/10/8.
 * 39.二叉树的深度
 * 输入一棵二叉树，求该树的深度。从根结点
 * 到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */

public class Solution {
    public int TreeDepth(TreeNode pRoot)
    {
        if(pRoot==null){
            return 0;
        }
        int left = TreeDepth(pRoot.left);
        int right= TreeDepth(pRoot.right);
        return left>right?left+1:right+1;
    }

    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    };
}
