package cn.iwangxin.leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by 汪欣 on 2017/03/25.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class PostorderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if (root == null) return arr;
        TreeNode temp;
        Stack<TreeNode> st = new Stack();
        st.push(root);


        return arr;
    }
}
