package cn.icrn.Demo16;

/**
 * Created by yan on 2016/10/8.
 * 16.反转链表
 */

public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode reverselist = null;
        ListNode listnode = head;
        ListNode pPver = null;
        while(listnode!=null){
            ListNode next = listnode.next;
            if(next==null)
                reverselist = listnode;
            listnode.next = pPver;
            pPver = listnode;
            listnode = next;
        }
        return reverselist;
    }

    private class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}