package Demo19;

/**
 * Created by yan on 2016/10/8.
 * 19.�������ľ���
 ���������Ķ�����������任ΪԴ�������ľ���
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
