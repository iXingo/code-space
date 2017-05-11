package cn.iwangxin.schoolrecruit;

public class LongestSubstring {
    public static int findLongest(String A, int n, String B, int m) {
        // write code here
        int result = 0;     //记录最长公共子串长度
        int c[][] = new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            for( int j = 0; j <= m; j++) {
                if(i == 0 || j == 0) {
                    c[i][j] = 0;
                } else if (A.charAt(i-1) == B.charAt(j-1)) {
                    c[i][j] = c[i-1][j-1] + 1;
                    result = Math.max(c[i][j], result);
                } else {
                    c[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findLongest("1AB2345CD",9,"12345EF",7));
    }
}