package Demo29;

/**
 * Created by yan on 2016/10/8.
 * 29.�����г��ִ�������һ�������
 * ��������һ�����ֳ��ֵĴ���������
 * �鳤�ȵ�һ�룬���ҳ�������֡���
 * ������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ�����
 * ���鳤�ȵ�һ�룬������2����������������0��
 */
import java.util.Arrays;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        if(array.length==0)
            return 0;
        int res = array[array.length/2];
        int index1 = array.length/2+1;
        int index2 = array.length/2-1;
        int count = 1;
        while(index1<array.length&&index2>=0){
            if(array[index1++]==res)
                count++;
            if(array[index2--]==res)
                count++;
        }
        if(count<array.length/2+1)
            res = 0;
        return res;
    }
}
