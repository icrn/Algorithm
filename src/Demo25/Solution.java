package Demo25;

/**
 * Created by yan on 2016/10/8.
 * 25.�������к�Ϊĳһֵ��·��
 ����һ�Ŷ�������һ��������
 ��ӡ���������н��ֵ�ĺ�
 Ϊ��������������·����·
 ������Ϊ�����ĸ���㿪ʼ
 ����һֱ��Ҷ����������Ľ���γ�һ��·����
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