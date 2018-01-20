package cn.iwangxin.company.qihoo.T1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0,m = 0,a =0,b=0,c=0,d=0,x=0,y=0,z = 0;
        n = in.nextInt();
        m = in.nextInt();

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        System.out.println(getResult(n,m,a,b,c,d,x,y,z));
    }

    public static int getResult(int n, int m, int a, int b, int c, int d, int x, int y, int z){
        int result = 0;
        int num1 = n;//白色使用
        int num2 = m;//彩色使用
        while(num1 > 0 && num2 > 0){
            while(num1 > 0 && num2 > 0 && z > x && z > y){
               result += x;
               num1 -= a;
               num2 -= d;
            }
            while(num1 > 0 && num2 > 0 && y > x && y > z){
               result += x;
               num1 -= a;
               num2 -= c;
            }
            while(num1 > 0 && num2 > 0 && x > y && x > z){
               result += x;
               num1 -= a;
               num2 -= b;
            }
        }
        return result;
    }
}
