package Demo30;

/**
 * Created by yan on 2016/10/8.
 * 30.��С��K����
 ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 */
import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> array  = new ArrayList<Integer>();
        if(k<=0)
            return array;
        if(input.length==0)
            return array;
        if(input.length<k)
            return array;
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            array.add(input[i]);
        }
        return array;
    }
}
