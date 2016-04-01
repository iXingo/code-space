package cn.iwangxin.InternetRecruit.HuaWeiYanfa.MingMingRandomNumber;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by 汪欣 on 2017/05/31.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new TreeSet<Integer>();
        int num = sc.nextInt();
        int index =0;
        while(index++ < num){
            s.add(sc.nextInt());
        }
        for(int i: s){
            System.out.print(i + " ");
        }
    }
}
