package Demo25;

/**
 * Created by yan on 2016/10/8.
 * 25.二叉树中和为某一值的路径
 输入一颗二叉树和一个整数，
 打印出二叉树中结点值的和
 为输入整数的所有路径。路
 径定义为从树的根结点开始
 往下一直到叶结点所经过的结点形成一条路径。
 */
import java.util.ArrayList;
public class Solution {
    ArrayList list=new ArrayList();
    ArrayList stack=new ArrayList();
    int currentNum=0;
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null)
            return list;
        currentNum += root.val;
        stack.add(root.val);
        if(currentNum==target&&root.left==null&&root.right==null){
            ArrayList path = new ArrayList();
            for(int i=0;i<stack.size();i++)
                path.add(stack.get(i));
            list.add(path);
        }
        if(root.left!=null)
            FindPath(root.left,target);
        if(root.right!=null)
            FindPath(root.right,target);
        currentNum -=root.val;
        stack.remove(stack.size()-1);
        return list;
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