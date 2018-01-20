package cn.iwangxin.company.zhaoshang.T1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            result(a,b,n);
        }
    }

    private static void result(int a, int b, int n) {
        int i = 1;
        int count = 0;
        while(i <= n){
            if(i % a == 0 && i % b == 0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
