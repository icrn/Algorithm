package cn.icrn.Demo37;

/**
 * Created by yan on 2016/10/8.
 * 37.两个链表的第一个公共结点
 * 输入两个链表，找出它们的第一个公共结点。
 */

import java.util.HashMap;

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode list1 = pHead1;
        ListNode list2 = pHead2;
        HashMap<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
        while(list1!=null){
            hashMap.put(list1,null);
            list1 = list1.next;
        }
        while(list2!=null){
            if (hashMap.containsKey(list2))
                return list2;
            list2 = list2.next;
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
