package Demo11;

/**
 * Created by yan on 2016/10/8.
 * 11.数值的整数次方
 * 给定一个double类型的浮点数base
 * 和int类型的整数exponent。求base的exponent次方。
 */

public class Solution {
    public double Power(double base, int exponent) {
        if(exponent==0)
            return 1;
        else if(exponent>1){
            double num = base;
            for(int i = 1; i < exponent; i++){
                num = num * base;
            }
            return num;
        }else {
            double nums = base;
            int flag = -exponent;
            for(int i = 1; i < flag; i++){
                nums = nums * base; 
        }
            return 1/nums;
        }
    }
}