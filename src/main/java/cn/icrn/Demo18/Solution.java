package cn.icrn.Demo18;

/**
 * Created by yan on 2016/10/8.
 *
 * 18.树的子结构
 输入两棵二叉树A，B，判断B是不是A的子结构。
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if(root1!=null&&root2!=null){
            if(root1.val==root2.val){
                res = ZTree(root1,root2);
            }
            if(!res){
                res = HasSubtree(root1.left,root2);
            }
            if(!res){
                res = HasSubtree(root1.right,root2);
            }
        }
        return res;
    }

    public boolean ZTree(TreeNode root1,TreeNode root2){
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return ZTree(root1.right,root2.right)&&ZTree(root1.left,root2.left);
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
