package Demo05;

/**
 * Created by yan on 2016/10/8.
 * 05.从尾到头打印链表
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */

import java.util.Stack;
import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }

    public class ListNode {
            int val;
            ListNode next = null;
            ListNode(int val) {
            this.val = val;
            }
    }
}