package cn.iwangxin.company.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] num = new int[n];
            int summ = 0;
            for (int i = 0; i < n; i++) {
                num[i] = in.nextInt();
                summ += num[i];
            }
            System.out.println(result(n,num,summ));
        }
    }

    public static String result(int n ,int[] sum,int summ){
        String yes = "Yes";
        String no = "No";
        Arrays.sort(sum);
        if(sum[n-1] == sum[n-2])
            return yes;
        else if(sum[n-1] <= summ - sum[n-1])
            return no;
        else return no;
    }
}
