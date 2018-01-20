package cn.iwangxin.company.toutiao.T1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int[] num1 = new int[N];
            int[] num2 = new int[N];
            for(int i =0;i < N;i++){
                num1[i] = sc.nextInt();
                num2[i] = sc.nextInt();
            }
            printMax(num1,num2);
        }
    }
    public static void printMax(int[] num1,int[] num2){
        for (int i = 0; i < num1.length; i++) {
            int count = 0;
             for (int j = 0; j < num1.length; j++){
                 if(num1[j] > num1[i] && num2[j] > num2[i]){
                     count++;
                 }
             }
             if(count == 0) System.out.println(num1[i] + " " +num2[i]);
        }
    }
}
