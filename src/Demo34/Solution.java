package Demo34;

/**
 * Created by yan on 2016/10/8.
 * 34.����
 * ��ֻ��������2��3��5������
 * ��������Ugly Number��������6��8���ǳ�����
 * ��14���ǣ���Ϊ����������7��
 * ϰ�������ǰ�1�����ǵ�һ��������
 * �󰴴�С�����˳��ĵ�N��������
 */
public class Solution {
    public int GetUglyNumber_Solution(int n) {
        if(n == 0)
            return 0;
        int[] uglyNumberArray = new int[n];
        uglyNumberArray[0] = 1;// ��һ��������1
        int index = 0;
        int index_2 = 0;
        int index_3 = 0;
        int index_5 = 0;

        while (index < n - 1) {
            int min = min(uglyNumberArray[index_2] * 2,
                    uglyNumberArray[index_3] * 3, uglyNumberArray[index_5] * 5);
            index++;
            uglyNumberArray[index] = min;

            /**
             * ��������
             */
            if (uglyNumberArray[index_2] * 2 == min) {
                index_2++;
            }

            if (uglyNumberArray[index_3] * 3 == min) {
                index_3++;
            }

            if (uglyNumberArray[index_5] * 5 == min) {
                index_5++;
            }
        }

        return uglyNumberArray[n - 1];
    }

    private static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    private static int min(int a, int b) {
        return a > b ? b : a;
    }

}
