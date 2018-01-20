package cn.iwangxin.company.meituan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = in.nextInt();
            }
            int m = in.nextInt();
            System.out.println(result(n,num,m));
        }
    }

    public static int result(int n ,int[] sum, int m){
        int max = 0;
        for(int i=0;i<n;i++){
        	int x = 0;
        	int a = 0;
        	for(int j=i;j<n;j++){
				x += sum[j];
				a++;
				if(x % m == 0){
					max = a>max?a:max;
				}
			}
       	}
       	return max;
    }
}
