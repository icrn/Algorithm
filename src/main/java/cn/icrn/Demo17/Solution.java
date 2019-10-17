package cn.icrn.Demo17;

/**
 * Created by yan on 2016/10/8.
 * 17.合并两个排序的链表
 输入两个单调递增的链表，
 输出两个链表合成后的链表
 ，当然我们需要合成后的链
 表满足单调不减规则。
 */

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode pMerge = null;
        if(list1.val<list2.val){
            pMerge = list1;
            pMerge.next = Merge(list1.next,list2);
        }else{
            pMerge = list2;
            pMerge.next = Merge(list1,list2.next);
        }
        return pMerge;
    }
    private class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
