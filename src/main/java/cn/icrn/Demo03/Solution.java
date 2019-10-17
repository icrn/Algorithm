package cn.icrn.Demo03;

/**
 * Created by yan on 2016/10/8.
 * 03.二维数组中的查找
 * 在一个二维数组中，每一行都按照从左到右递增
 * 的顺序排序，每一列都按照从上到下递增的顺序
 * 排序。请完成一个函数，输入这样的一个二维数
 * 组和一个整数，判断数组中是否含有该整数。
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