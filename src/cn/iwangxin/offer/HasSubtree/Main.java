package cn.iwangxin.offer.HasSubtree;

import cn.iwangxin.util.TreeNode;

public class Main {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean result = false;

        if(root1 != null && root2 != null){

            if(root1.val == root2.val){
                result = findSubTree(root1,root2);
            }

            if(!result) result = HasSubtree(root1.left,root2);
            if(!result) result = HasSubtree(root1.right,root2);
        }

        return result;

}

    private boolean findSubTree(TreeNode root1, TreeNode root2) {
        if(root2 == null) return  true;
        if(root1 == null) return false;

        if(root1.val != root2.val) return false;

        return findSubTree(root1.left,root2.left) && findSubTree(root1.right,root2.right);
    }


}
