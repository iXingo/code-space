package cn.iwangxin.company.qihoo.T3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int[] data = null;
        int[] num = null;
        while (in.hasNext()) {
            n = in.nextInt();
            data = new int[n];
            for(int i=0;i < n;i++){
                data[i] = in.nextInt();
            }
            m = in.nextInt();
            num = new int[m];
            for(int i=0;i < m;i++){
                num[m] = in.nextInt();
            }
        }
        getResult(data,n,num,m);
    }

    public static void getResult(int[]data ,int n,int[] nmum ,int m) {

    }
}
