package cn.iwangxin.offer.ReplaceSpace;

/**
 * Created by 汪欣 on 2017/06/06.
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        if(str == null) return null;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<str.length()){
            if(str.charAt(i) ==' '){
                sb.append("%20");
            }
            else sb.append(str.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
