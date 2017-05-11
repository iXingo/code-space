package cn.iwangxin.leetcode.binarytreepreordertraversal;

import java.util.ArrayList;
import java.util.Stack;

/* Definition for binary tree*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

}
public class Solution {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> arr =new ArrayList<Integer>();
        if(root == null) return arr;
        TreeNode temp;
        Stack<TreeNode> st = new Stack();
        st.push(root);
        while(!st.isEmpty()){
            temp = st.pop();
            arr.add(temp.val);
            if(temp.right != null){
                st.push(temp.right);
            }
            if(temp.left !=null){
                st.push(temp.left);
            }
        }
        return arr;
    }
}
