package cn.iwangxin.offer.PrintListFromTail;

import java.util.ArrayList;
import java.util.Stack;
/** */
class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }



public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arr = new  ArrayList<Integer>();
        Stack<Integer> stack = new Stack();
        if(listNode == null) return arr;
        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            arr.add(stack.pop());
        }
        return arr;
    }
}
