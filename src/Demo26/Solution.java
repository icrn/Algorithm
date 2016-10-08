package Demo26;

/**
 * Created by yan on 2016/10/8.
 * 26.复杂链表的复制
 * 输入一个复杂链表（每个节点中有节点值，
 * 以及两个指针，一个指向下一个节点，另
 * 一个特殊指针指向任意一个节点），返回
 * 结果为复制后复杂链表的head。（注意，
 * 输出结果中请不要返回参数中的节点引用
 * ，否则判题程序会直接返回空）
 */
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        Clone1(pHead);
        ConRan(pHead);
        return Rec(pHead);

    }

    void Clone1(RandomListNode pHead){
        RandomListNode p=pHead;
        while(p!=null){
            RandomListNode q=new RandomListNode(p.label);
            q.next=p.next;
            p.next=q;
            p=q.next;

        }

    }


    void ConRan(RandomListNode pHead){
        RandomListNode p=pHead;
        while(p!=null){
            RandomListNode q=p.next;
            if(p.random!=null){
                q.random=p.random.next;

            }
            p=q.next;
        }


    }

    RandomListNode Rec(RandomListNode pHead){
        RandomListNode p=pHead;
        RandomListNode clone=null;
        RandomListNode clohead=null;
        if(p!=null){
            clone=p.next;
            clohead=p.next;
            p.next=clone.next;
            p=p.next;

        }

        while(p!=null){
            clone.next=p.next;
            clone=clone.next;
            p.next=clone.next;
            p=p.next;



        }
        return clohead;

    }

    private class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
}
