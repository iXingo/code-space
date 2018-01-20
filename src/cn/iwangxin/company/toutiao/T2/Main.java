package cn.iwangxin.company.toutiao.T2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] num = new int[N];
            int count = 0;
            int max = 0;
            int min = 0;
            int result = 0;
            int mid = 0;
            for (int i = 0; i < N; i++) {
                num[i] = sc.nextInt();
                count += num[i];
                max = max > num[i] ? max : num[i];
                min = min < num[i] ? min : num[i];
                if(min == 0) min = num[i];
                if(i>0) {
                    int mix = num[i] > num[i - 1] ? num[i - 1] : num[i];
                    mid = mid > mix * (num[i] + num[i - 1]) ? mid : mix * (num[i] + num[i - 1]);
                }
                else{
                    int mix = 0;
                    mid = num[i];
                }
            }
            result = mid > max*max?mid:max*max;
            result = result > min*count?result:min*count;
            System.out.println(result);
        }
    }
}

