package cn.iwangxin.leetcode.MinimumDepthofBinaryTree;

/**
 * Created by 汪欣 on 2017/05/11.
 */
/**
 * Definition for binary tree */
class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

public class Solution {
    public int run(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return run(root.right) + 1;
        if(root.right == null) return run(root.left) + 1;
        int leftDepth = run(root.left);
        int rightDepth = run(root.right);
        return leftDepth < rightDepth ? (leftDepth + 1) : (rightDepth + 1);
    }
}
