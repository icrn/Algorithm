package Demo10;
/**
 * Created by yan on 2016/10/8.
 * 10.��������1�ĸ���
 * ����һ��������������������Ʊ�ʾ��1�ĸ�����
 * ���и����ò����ʾ��
 */
public class Solution {
    public int  NumberOf1(int n) {
         int count = 0;
         while(n!=0){
             n=n&(n-1);
             count++;
         }
    	return count;
    }
}