package Demo11;

/**
 * Created by yan on 2016/10/8.
 * 11.��ֵ�������η�
 * ����һ��double���͵ĸ�����base
 * ��int���͵�����exponent����base��exponent�η���
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