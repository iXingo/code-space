package cn.iwangxin.offer.Mirror;

import cn.iwangxin.util.TreeNode;

public class Main {
    public void Mirror(TreeNode root) {

        if(root == null || root.left == null && root.right==null) return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if(root.left !=null){
            Mirror(root.left);
        }
        if(root.right != null){
            Mirror(root.right);
        }
    }
}
