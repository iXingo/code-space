package cn.iwangxin.InternetRecruit.HuaWeiYanfa.HighestScore;

import java.util.Scanner;

/**
 * Created by 汪欣 on 2017/06/01.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int m = sc.nextInt();//学生数
            int n = sc.nextInt();//操作的数
            int[] score = new int[m];
            int index = 0;
            while (index < m) {
                score[index] = sc.nextInt();
                index++;
            }
            for (int i = 0; i < n; i++) {
                String sr = sc.next();
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (sr.equals("Q")) getMax(score, a, b);
                else update(score, a, b);
            }
        }

    }


    public static void getMax(int[] score,int a,int b){
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        int max = -1;
        for(int i = a-1;i <b;i++){
            if(score[i] > max) max = score[i];
        }
        System.out.println(max);
    }

    public static void update(int[] score,int a,int b){
        score[a-1] = b;
    }


}
