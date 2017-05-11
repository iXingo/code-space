package cn.iwangxin.leetcode;

/**
 * Created by 汪欣 on 2017/05/08.
 */
public class StringFormat {
    public static String formatString(String A, int n, char[] arg, int m) {
        // write code here
        int i = 0, j=1;
        int x = 0;
        StringBuilder sb = new StringBuilder();
        for(;i < n-1;i++,j++){
            if(A.charAt(i) =='%' && A.charAt(j) == 's'){
                sb.append(arg[x++]);
                i++;j++;
            }
            else sb.append(A.charAt(i));
        }
        if(A.charAt(n-1) != 's') sb.append(A.charAt(n-1));
        while(x<m) {
            sb.append(arg[x++]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(formatString("QJF%sBYCKZVKZY%sTPHWQBNYOYTNQDBQKTGJTCWPOJCOXJGETXDQGB%sSHFXMVKCVARLXNMGLINRQXBNUVESGVCQMESZWMSRSQGDKSURXUTJPBYUNKBUHEAKHQN%sST%sYJZSUJEIOKTBQFA%sIMEQEQZFRWOM%s", 160, new char[] {'E','F','Z','C','X','D','U','J'}, 8));
    }
}
