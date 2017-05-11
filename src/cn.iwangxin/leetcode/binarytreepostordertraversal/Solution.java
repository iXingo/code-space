package cn.iwangxin.leetcode.binarytreepostordertraversal;


import java.util.*;
/**
 * Definition for binary tree
 *  */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}


public class Solution {
    ArrayList<Integer> arr = new  ArrayList();
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            arr.add(root.val);
        }
        return arr;
    }
}