package Demo09;
/**
 * Created by yan on 2016/10/8.
 * 09.斐波那契数列
 * 现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 */
public class Demo09 {
    public int Fibonacci(int n) {
        int result=0;
        int prenum=1;
        int preprenum=0;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        for(int i=2;i<=n;i++){
           	result = prenum+preprenum;
            preprenum=prenum;
            prenum=result;
        }
        return result;
    }
}