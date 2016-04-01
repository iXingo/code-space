package cn.iwangxin.InternetRecruit.HuaWeiYanfa.HexadecimalConversion;

import java.util.Scanner;

/**
 * Created by 汪欣 on 2017/05/31.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.next();
            String sr = s.substring(2,s.length());
            System.out.println(Integer.valueOf(sr,16));
        }
    }
}
