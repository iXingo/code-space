package cn.iwangxin.company.iqiyi.T2;


import java.util.Scanner;

public class Main {
    public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
		    int t= scan.nextInt();
		    int[] data = new int[t];
		    for(int i =0;i<t;i++){
		        data[i]=scan.nextInt();
		        getResult(data[i]);
            }

	    }
    }

	private static void getResult(int data) {
    	String Niu ="niu";
    	String Yang = "yang";
		Integer.toString(data, 4);
	}
}
