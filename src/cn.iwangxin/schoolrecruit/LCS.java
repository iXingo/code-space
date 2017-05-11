package cn.iwangxin.schoolrecruit;

//最长公共子序列

public class LCS {
    public static int findLCS(String A, int n, String B, int m) {
        // write code here
        int[][] maxLCS = new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            for( int j = 0; j <= m; j++) {
                if(i == 0 || j == 0) {
                    maxLCS[i][j] = 0;
                } else if (A.charAt(i-1) == B.charAt(j-1)) {
                    maxLCS[i][j] = maxLCS[i-1][j-1] + 1;
                } else {
                    maxLCS[i][j] = Math.max(maxLCS[i-1][j], maxLCS[i][j-1]);
                }
            }
        }
        return maxLCS[n][m];
    }

    public static void main(String[] args) {
        //System.out.println(findLCS("cnblogs",7,"belong",6));
    }
}
