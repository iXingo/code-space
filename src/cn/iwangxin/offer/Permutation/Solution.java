package cn.iwangxin.offer.Permutation;

import java.util.ArrayList;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();
        int [] arr = new int [str.length()];
        dfs(0,str,arr,list);
        return list;
    }
    public void dfs(int cur, String str, int[] arr, ArrayList<String> list){
        if(cur==arr.length){
            String line="";
            for(int a : arr){
                line += str.charAt(a)+"";
            }
            list.add(line);
        }else{
            for(int i=0;i<str.length();i++){
                Boolean ok = true;
                for(int j=0;j<cur;j++){
                    if(i==arr[j]) {
                        ok = false;
                        break;
                    }
                }
                if(ok){
                    arr[cur] = i;
                    dfs(cur+1,str, arr, list);
                }
            }
        }
    }

    public static void main(String[] args) {
       String line = "aa";
       ArrayList<String> list =  new Solution().Permutation(line);
        for(String str : list){
            System.out.println(str);
        }
        System.out.println(list.size());
    }
}