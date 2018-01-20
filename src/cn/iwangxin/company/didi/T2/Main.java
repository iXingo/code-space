package cn.iwangxin.company.didi.T2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = null;
        int k = 0;
        while (in.hasNext()) {
            String s = in.nextLine();
            str = s.split(" ");
            k = in.nextInt();
            break;
        }
        int[] data = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            data[i] = Integer.parseInt(str[i]);
        }
        sort(data,0,data.length-1);
        System.out.println(data[k-1]);
    }

    public static int partition(int []data,int lo,int hi){
        int index=data[lo];
        while(lo<hi){
            while(hi>lo && data[hi]>=index) hi--;
            data[lo]=data[hi];
            while(hi>lo && data[lo]<=index) lo++;
            data[hi]=data[lo];
        }
        data[hi]=index;
        return hi;
    }

    public static void sort(int[] data,int lo ,int hi){
        if(lo>=hi) return;
        int index=partition(data,lo,hi);
        sort(data,lo,index-1);
        sort(data,index+1,hi);
    }

}
