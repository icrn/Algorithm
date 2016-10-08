package Demo06;

/**
 * Created by yan on 2016/10/8.
 * 06.重建二叉树
 * 输入某二叉树的前序遍历和中
 * 序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结
 * 果中都不含重复的数字。例如输入前
 * 序遍历序列{1,2,4,7,3,5,6,8}和
 * 中序遍历序列{4,7,2,1,5,3,8,6}
 * ，则重建二叉树并返回。
 */

public class Solution {
     public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstructBTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    private TreeNode reConstructBTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {

        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);
        for(int i=startIn;i<=endIn;i++) {
            if (in[i] == pre[startPre]) {
                root.left=reConstructBTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBTree(pre,i-startIn + startPre + 1, endPre, in, i + 1, endIn);
            }
        }
        return root;
    }

      private class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

}