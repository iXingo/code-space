package cn.iwangxin.company.nvidia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = "&lt;";
        String str2 = "&gt;";
        String str3 = "&amp;";
        String str4 = "&quot;";
        String str5 = "&nbsp;";
        while (in.hasNext()) {
            String s = in.nextLine();
            s=s.replace(str1,"<");
            s=s.replace(str2,">");
            s=s.replace(str3,"&");
            s=s.replace(str4,"\"");
            s=s.replace(str5," ");
            System.out.println(s);
        }
    }

}
