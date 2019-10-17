package cn.icrn.Demo22;

/**
 * Created by yan on 2016/10/8.
 * 22.栈的压入、弹出序列
 * 输入两个整数序列，第一个序列表示栈
 * 的压入顺序，请判断第二个序列是否为
 * 该栈的弹出顺序。假设压入栈的所有数
 * 字均不相等。例如序列1,2,3,4,5是某
 * 栈的压入顺序，序列4，5,3,2,1是该压
 * 栈序列对应的一个弹出序列，但4,3,5,1,2
 * 就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
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
