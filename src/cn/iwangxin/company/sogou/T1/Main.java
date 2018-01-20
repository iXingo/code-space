package cn.iwangxin.company.sogou.T1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) throws IOException {
//		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
         BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(reader.readLine());
		double [] data = new double[N];
		for(int i=0;i<N;i++) {
		    data[i] = Double.parseDouble(reader.readLine());
		}
		lengthBetweenTwoCircle(N,data);
	}

	public static void lengthBetweenTwoCircle(int N, double[] data){
	    double maxium = 0.0;
		DecimalFormat decimalFormat = new DecimalFormat("###0.00000000");
		for(int i=0;i<N;i++){
			for(int j=N-1;j>i;j--){
				double len = data[j]-data[i];
				if(len>180){
					len=360-len;
					if(len>maxium) maxium = len;
				}else{
					if(len>maxium) maxium = len;
					break;
				}
			}
			if(data[N-1]-data[i]<maxium) break;
		}
		System.out.println(decimalFormat.format(maxium));
    }
}

