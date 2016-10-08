package Demo07;

/**
 * Created by yan on 2016/10/8.
 * 07.������ջʵ�ֶ���
 * ������ջ��ʵ��һ�����У�
 * ��ɶ��е�Push��Pop������
 * �����е�Ԫ��Ϊint���͡�
 */

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if(stack2.empty()){
           while(!stack1.empty())
               stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}