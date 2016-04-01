package cn.iwangxin.InternetRecruit.HuaWeiYanfa.SodaBottles;


import java.util.Scanner;

/**
 * Created by 汪欣 on 2017/05/31.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int sx = sc.nextInt();
            if(sx!=0) {
                System.out.println(sx/2);
            }
            else break;
        }
    }

}
