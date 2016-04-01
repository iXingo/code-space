package cn.iwangxin.offer.Merge;

/**
 * Created by 汪欣 on 2017/05/24.
 *
 */
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    //Step1.定义一个指向新链表的指针，暂且让它指向NULL；
    //Step2.比较两个链表的头结点，让较小的头结点作为新链表的头结点；
   //Step3.递归比较两个链表的其余节点，让较小的节点作为上一个新节点的后一个节点；
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        ListNode newHead = null;
        if (list1.val <= list2.val)
        {
            newHead = list1;
            newHead.next = Merge(list1.next, list2);
        }
        else
        {
            newHead = list2;
            newHead.next = Merge(list1, list2.next);
        }
        return newHead;
    }
}
