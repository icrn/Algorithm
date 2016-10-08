package Demo27;

/**
 * Created by yan on 2016/10/8.
 * 27.������������˫������
 ����һ�ö��������������ö���������
 ת����һ�������˫������Ҫ���ܴ�
 ���κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��

 */

public class Solution {
    public TreeNode Convert(TreeNode root) {
        if(root==null)
            return null;
        if(root.left==null&&root.right==null)
            return root;
        // 1.�������������˫��������������ͷ�ڵ�
        TreeNode left = Convert(root.left);
        TreeNode p = left;
        // 2.��λ��������˫�������һ���ڵ�
        while(p!=null&&p.right!=null){
            p = p.right;
        }
        // 3.�������������Ϊ�յĻ�������ǰroot׷�ӵ�����������
        if(left!=null){
            p.right = root;
            root.left = p;
        }
        // 4.�������������˫��������������ͷ�ڵ�
        TreeNode right = Convert(root.right);
        // 5.�������������Ϊ�յĻ�����������׷�ӵ�root�ڵ�֮��
        if(right!=null){
            right.left = root;
            root.right = right;
        }
        return left!=null?left:root;
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