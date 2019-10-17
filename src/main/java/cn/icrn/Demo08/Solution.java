package cn.icrn.Demo08;

/**
 * Created by yan on 2016/10/8.
 * 08.旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
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