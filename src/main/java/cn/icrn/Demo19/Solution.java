package cn.icrn.Demo19;

/**
 * Created by yan on 2016/10/8.
 * 19.二叉树的镜像
 操作给定的二叉树，将其变换为源二叉树的镜像。
 */


public class Solution {

    public void Mirror(TreeNode root) {
        if(root==null)
            return;
        Mirror(root.left);
        Mirror(root.right);
        TreeNode p = root.left;
        root.left = root.right;
        root.right=p;
    }

    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
