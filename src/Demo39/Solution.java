package Demo39;

/**
 * Created by yan on 2016/10/8.
 * 39.�����������
 * ����һ�ö����������������ȡ��Ӹ����
 * ��Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
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
