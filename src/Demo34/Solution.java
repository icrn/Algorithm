package Demo34;

/**
 * Created by yan on 2016/10/8.
 * 34.丑数
 * 把只包含因子2、3和5的数称
 * 作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。
 * 求按从小到大的顺序的第N个丑数。
 */
public class Solution {
    public int GetUglyNumber_Solution(int n) {
        if(n == 0)
            return 0;
        int[] uglyNumberArray = new int[n];
        uglyNumberArray[0] = 1;// 第一个丑数是1
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
             * 调整索引
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
