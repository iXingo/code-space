package cn.iwangxin.leetcode.longestpalindromicsubstring;

public class Solution {
    public static String longestPalindrome(String s) {
        int length = s.length();
        int max = 1;
        int maxi = 0,maxj = 0,j = 0;
        boolean[][] mark = new boolean[length][length];
        for(int gap = 0;gap < length;gap++) {
            for (int i = 0; i < length - gap; i++) {
                j = i + gap;
                if(s.charAt(i) == s.charAt(j) && (j-i<=2 || mark[i+1][j-1])){
                    mark[i][j] = true;
                    if(j-i+1 > max){
                        maxi = i;
                        maxj = j;
                        max = j-i+1;
                    }
                }
            }
        }
        return maxi==maxj?s.substring(maxi):s.substring(maxi,maxj+1);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }
}
