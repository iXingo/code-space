package cn.iwangxin.company.jingdong.T2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    int n = 0;
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			n=in.nextInt();

		}
		System.out.println(result(n));
	}

	public static long result(int n){
		long result=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				for(int k=1;k<=n;k++){
					for(int l=1;l<=n;l++){
						if(Math.pow(i, j)==Math.pow(k, l)){
							result++;
						}
					}
				}
			}
		}
		return result % 1000000007;
	}

}

