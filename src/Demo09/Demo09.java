package Demo09;
/**
 * Created by yan on 2016/10/8.
 * 09.쳲���������
 * ����Ҫ������һ������n���������쳲��������еĵ�n�
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