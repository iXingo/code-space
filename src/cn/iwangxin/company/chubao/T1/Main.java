package cn.iwangxin.company.chubao.T1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = 0;
        String[] str = null;
        while (in.hasNextInt()) {
            N = in.nextInt();
            str = new String[N];
            for (int i = 0; i < N; i++) {
                str[i] = in.next();
            }
            int M = in.nextInt();
            String[] strings = new String[M];
            for (int j = 0; j < M; j++) {
                strings[j] = in.next();
            }

            for (int i = 0; i < M; i++) {
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if(str[j].contains(strings[i])){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }

    }
}