package Demo08;

/**
 * Created by yan on 2016/10/8.
 * 08.��ת�������С����
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */

public class Solution {
    public int minNumberInRotateArray(int [] array) {
    	int index1 = 0;
        int index2 = array.length-1;
        int mid = 0;
        while(array[index1]>=array[index2]){
            if(index2-index1==1)
                return array[index2];
            mid = (index1+index2)/2;
            if(array[index1]<=array[mid])
                index1 = mid;
            else if(array[index2]>=array[mid])
                index2 = mid;
        }
        return array[mid];
    }
}