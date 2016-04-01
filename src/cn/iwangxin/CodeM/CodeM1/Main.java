package cn.iwangxin.CodeM.CodeM1;

import java.util.Scanner;

/**
 * Created by 汪欣 on 2017/06/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            int n = in.nextInt();
            int[] music1 = new int[n];
            for(int i = 0; i < n;i++){
                music1[i] = in.nextInt();
            }
            int m = in.nextInt();
            int[] music2 = new int[m];
            for(int j = 0; j < m;j++){
                music2[j] = in.nextInt();
            }
            double difference = Integer.MAX_VALUE;
            for(int j = 0;j <= m-n;j++){
                double different = 0;
                for(int i =0;i< n;i++){
                    different += Math.pow((music1[i] - music2[j+i]),2);
                }
                difference = different<difference?different:difference;
            }
            System.out.println((int)difference);
        }
    }
}
