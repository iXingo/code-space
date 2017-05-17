package cn.iwangxin.offer.ReverseList;

import java.util.Stack;

/**
 * Created by 汪欣 on 2017/05/17.
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    //时间开销太大，Reject
    public ListNode ReverseList1(ListNode head) {
        ListNode node, first;
        Stack<ListNode> stack = new Stack();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        first = node = stack.pop();
        System.out.print(node.val);
        while (!stack.isEmpty()) {
            node.next = stack.pop();
            node = node.next;
            System.out.print(node.val);
        }
        return first;
    }

    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode no = s.ReverseList(n1);
        while(no!=null){
            System.out.println(no.val);
            no = no.next;
        }
    }
}
