package Demo03;

/**
 * Created by yan on 2016/10/8.
 * 03.��ά�����еĲ���
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ���
 * ��˳������ÿһ�ж����մ��ϵ��µ�����˳��
 * ���������һ������������������һ����ά��
 * ���һ���������ж��������Ƿ��и�������
 */

public class Solution {
    public boolean Find(int [][] array,int target) {
		int lie = array[0].length-1;
        int hang=array.length;
       	int row = 0;
        while(hang>row&&lie>=0){
            if(array[row][lie]==target)
                return true;
            else if(array[row][lie]>target)
                lie--;
            else
                row++;
        }
        return false;
    }
}