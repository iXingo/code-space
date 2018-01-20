package cn.iwangxin.company.zhaoshang.T2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int m = in.nextInt();
            int[] data = new int[m];
            for (int i = 0; i < m; i++) {
                data[i] = in.nextInt();
            }
            result(m,data);
        }
    }

    private static void result(int m, int[] data) {
        int i = 1;
        int count = 0;
        while(i <= m){
            if(i % m == 0 && i % m == 0){
                count++;
            }
            i++;
        }
        if(m%2==0){
        System.out.println("true");}
        else{
            System.out.println("false");
        }
    }
}
