package cn.icrn.Demo23;

/**
 * Created by yan on 2016/10/8.
 * 23.从上往下打印二叉树
 从上往下打印出二叉树的每个节点，同层节点从左至右打印。

 */
import java.util.ArrayList;
import java.util.LinkedList;
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        LinkedList queue = new LinkedList();
        if(root == null){
            return array;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode t = (TreeNode)queue.removeFirst();
            array.add(t.val);
            if(t.left!=null)
                queue.add(t.left);
            if(t.right!=null)
                queue.add(t.right);
        }
        return array;
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
