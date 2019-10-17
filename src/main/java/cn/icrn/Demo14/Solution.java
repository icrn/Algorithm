package cn.icrn.Demo14;

/**
 * Created by yan on 2016/10/8.
 * 14.调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来
 * 调整该数组中数字的顺序，使得所有
 * 的奇数位于数组的前半部分，所有的
 * 偶数位于位于数组的后半部分，并保
 * 证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

public class Solution {
    public void reOrderArray(int [] array) {
        for (int i = 0; i < array.length;i++)
        {
            for (int j = array.length - 1; j>i;j--)
            {
                if (array[j] % 2 == 1 && array[j - 1]%2 == 0) //前偶后奇交换
                {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }
}