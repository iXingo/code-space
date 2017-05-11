package cn.iwangxin.schoolrecruit;

/* 最长回文子串 */

public class Palindrome {
    public static int getLongestPalindrome(String A, int n) {
        boolean[][] s = new boolean[n][n];
        int maxLength = 1;
        int j = 0;
        for(int gap = 0;gap < n;gap++) {
            for (int i = 0; i < n - gap; i++) {
                j = i + gap;
                if (A.charAt(i) == A.charAt(j)  && (j-i <=2 || s[i+1][j-1])) {
                    s[i][j] = true;
                    maxLength = maxLength>(j-i+1)?maxLength:(j-i+1);
                    //System.out.println(maxLength);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String A = "abc1234321ab";
        System.out.println(getLongestPalindrome(A, 12));
    }
}
