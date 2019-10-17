package cn.icrn.Demo32;

/**
 * Created by yan on 2016/10/8.
 * 32.整数中1出现的次数
 */
class Solution {
    public int NumberOf1Between1AndN_Solution(int n)
    {
        int count = 0;
        for(long i=1;i<=n;i*=10){
            long a = n / i;
            long b = n % i;
            count += (a+ 8) / 10 * i + (a % 10 == 1 ? b + 1 : 0);
        }
        return count;
    }
};
