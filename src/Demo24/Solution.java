package Demo24;

/**
 * Created by yan on 2016/10/8.
 * 24.�����������ĺ����������
 ����һ���������飬�жϸ�������
 ����ĳ�����������ĺ�������Ľ����
 ����������Yes,�������No��
 �������������������������ֶ�������ͬ��
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
