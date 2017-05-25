package cn.iwangxin.offer.FindKthToTail;

/**
 * Created by 汪欣 on 2017/05/24.
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null) return head;
        if(k==0) return null;
        ListNode node1 = head;
        ListNode node2 = head;
        int num = 0;
        while(++num < k && node1.next != null) node1 = node1.next;
        if(num < k) return null;
        while(node1.next != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node2;
    }

    public static void main(String[] args) {
        ListNode n1= new ListNode(1);
        ListNode n2= new ListNode(2);
        ListNode n3= new ListNode(3);
        ListNode n4= new ListNode(4);
        ListNode n5= new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println(new Solution().FindKthToTail(n1,0).val);
    }
}
