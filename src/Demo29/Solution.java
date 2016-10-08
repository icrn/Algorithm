package Demo29;

/**
 * Created by yan on 2016/10/8.
 * 29.数组中出现次数超过一半的数字
 * 数组中有一个数字出现的次数超过数
 * 组长度的一半，请找出这个数字。例
 * 如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过
 * 数组长度的一半，因此输出2。如果不存在则输出0。
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
