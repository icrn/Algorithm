package Demo28;

/**
 * Created by yan on 2016/10/8.
 * 28.�ַ���������
 * ����һ���ַ���,���ֵ����ӡ��
 * ���ַ������ַ����������С�����
 * �����ַ���abc,���ӡ�����ַ�a,b,c
 * �������г����������ַ���abc,acb,
 * bac,bca,cab��cba�� ����밴��ĸ˳�������
 */
import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();
        if(str == null || str.length() == 0){
            return list;
        }
        char[] carr = str.toCharArray();
        //Arrays.sort(carr);
        permutation(carr, 0, list);
        Collections.sort(list);
        return list;
    }

    public void permutation(char[] carr, int index, ArrayList<String> list){

        if(index == carr.length){
            if(!list.contains(String.valueOf(carr))){
                list.add(String.valueOf(carr));
            }
        }else {
            for(int i = index;i < carr.length;i++){

                char tmp = carr[i];
                carr[i] = carr[index];
                carr[index] = tmp;

                permutation(carr, index + 1, list);

                tmp = carr[i];
                carr[i] = carr[index];
                carr[index] = tmp;
            }
        }
    }
}
