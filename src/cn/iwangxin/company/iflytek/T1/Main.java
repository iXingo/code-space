package cn.iwangxin.company.iflytek.T1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(in.hasNext()){
            String s = in.nextLine();
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(i));
            }
            int i =0;
            while(i < s.length()){
                int j = i;
                while(sb.charAt(j)==' '){
                    j++;
                    break;
                }
                if(s.charAt(i) != s.charAt(j) && i+1<s.length()){
                    sb.replace(i+1,i+2," ");
                }
                else{
                    i++;
                }
                
            }
        }
        String str = sb.toString();
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if(str.charAt(i)!= ' '){
                count++;
            }
        }
        System.out.println(count);
    }

}
