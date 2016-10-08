package Demo24;

/**
 * Created by yan on 2016/10/8.
 * 24.二叉搜索树的后序遍历序列
 输入一个整数数组，判断该数组是
 不是某二叉搜索树的后序遍历的结果。
 如果是则输出Yes,否则输出No。
 假设输入的数组的任意两个数字都互不相同。
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        return checkBST(sequence,0,sequence.length-1);
    }

    public boolean checkBST(int[] res,int start,int end){
        if(start>=end)
            return true;
        int flag = res[end];
        int i =start;
        for(;i<=end;i++){
            if(res[i]>=flag)
                break;
        }
        int j=end - 1;
        for(;j>=start;j--){
            if(res[j]<=flag)
                break;
        }
        if(i-j!=1)
            return false;
        return checkBST(res,start,i-1)&&checkBST(res,j+1,end-1);
    }
}
