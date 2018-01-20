package cn.iwangxin.company.ctrip.T3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> hashSet = new HashSet<>();
        String str = null;
        String string = null;
        while (sc.hasNext()) {
            str = sc.nextLine();
            string = hash(str);
        }
        System.out.println(string);
    }

    public static String hash(String s){
        int len = s.length();
        if(len < 2)
            return s;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; ++i)
        {
            if(s.charAt(i) != ' ')
            {
                sb.append(s.charAt(i));
                for(int j=i+1; j<len; ++j)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        sb.append(s.charAt(j));
                    }
                }
            }
        }
        return sb.toString();
    }
}
