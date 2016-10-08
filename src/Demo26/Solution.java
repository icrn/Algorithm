package Demo26;

/**
 * Created by yan on 2016/10/8.
 * 26.��������ĸ���
 * ����һ����������ÿ���ڵ����нڵ�ֵ��
 * �Լ�����ָ�룬һ��ָ����һ���ڵ㣬��
 * һ������ָ��ָ������һ���ڵ㣩������
 * ���Ϊ���ƺ��������head����ע�⣬
 * ���������벻Ҫ���ز����еĽڵ�����
 * ��������������ֱ�ӷ��ؿգ�
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
