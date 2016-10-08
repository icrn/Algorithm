package Demo33;

/**
 * Created by yan on 2016/10/8.
 * 33.�������ų���С����
 ����һ�����������飬��������������
 ��ƴ�������ų�һ��������ӡ��ƴ�ӳ�
 ��������������С��һ����������������
 {3��32��321}�����ӡ����������������
 �ɵ���С����Ϊ321323��
 */
import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        ArrayList list = new ArrayList();
        for(int i = 0;i<numbers.length;i++){
            list.add(Integer.toString(numbers[i]));
        }
        Collections.sort(list,new Compare());
        StringBuffer sb = new StringBuffer();
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            sb.append(it.next());
        }
        return sb.toString();
    }

    class Compare implements Comparator<String>{
        public int compare(String o1, String o2) {
            String s1 = o1+o2;
            String s2 = o2+o1;
            return s1.compareTo(s2);
        }
    }
}
