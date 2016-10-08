package Demo22;

/**
 * Created by yan on 2016/10/8.
 * 22.ջ��ѹ�롢��������
 * ���������������У���һ�����б�ʾջ
 * ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ
 * ��ջ�ĵ���˳�򡣼���ѹ��ջ��������
 * �־�����ȡ���������1,2,3,4,5��ĳ
 * ջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹ
 * ջ���ж�Ӧ��һ���������У���4,3,5,1,2
 * �Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 */
import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack();
        if(pushA.length==0||pushA.length!=popA.length)
            return false;
        int j=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (stack.peek()==popA[j]){
                stack.pop();
                j++;
                if(j==popA.length)
                    return true;
            }
        }
        return false;
    }
}
