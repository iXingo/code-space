package cn.iwangxin.company.yinxin.T2;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int M = in.nextInt();
            int N = in.nextInt();
            int result = (int)properity(M,N);
            System.out.println(result);
        }
    }

    private static double properity(int m, int n) {
        if(n == 0) return -1;
        if(m == 0) return -1;
        double sum = Math.pow(n,m);
        int i = 0;
        double result = n;
        while(i < m-1){
            result *= (n-1);
            i++;
        }
        return (sum-result) % 100003;
    }
}
