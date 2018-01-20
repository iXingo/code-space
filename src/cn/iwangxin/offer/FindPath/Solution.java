package cn.iwangxin.offer.FindPath;

import cn.iwangxin.util.TreeNode;

import java.util.ArrayList;


public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList();
        int curretSum = 0;
        FindPath(root, target, path, result, curretSum);
        return result;
    }

    private void FindPath(TreeNode root, int target, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result, int curretSum) {

        curretSum += root.val;
        path.add(root.val);
        boolean flag = root.left==null && root.right == null;
        if(curretSum == target && flag){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i<path.size();i++){
                temp.add(path.get(i));
            }
            result.add(temp);
        }

        if(root.left != null)
            FindPath(root.left ,target, path,result, curretSum);
        if(root.right != null)
            FindPath(root.right ,target, path,result, curretSum);
        path.remove((Integer)root.val);
    }


}

