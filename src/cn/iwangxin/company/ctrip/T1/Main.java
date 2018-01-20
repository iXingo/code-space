package cn.iwangxin.company.ctrip.T1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] data1 = new int[n];
            for (int i = 0; i < n; i++) {
                data1[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] data2 = new int[m];
            for (int i = 0; i < m; i++) {
                data2[i] = sc.nextInt();
            }
            System.out.println(ctripMiddle(data1, data2));
        }
    }

    public static float ctripMiddle(int data1[], int data2[]) {
        if(data1==null && data2==null) return 0;

        int m=0;
        int n=0;
        float k=0;
        float preK=0;
        int length = 0;
        if(data1==null) m=0; else m = data1.length;
        if (data2==null) n=0; else n = data2.length;
        length = m+n;
        if(length<2){
            if(m==0) return data2[0];
            else return data1[0];
        }
        int count = 0;
        int i=0,j=0;
        if(m==0){
            if (length%2==0){
                return ((float)data2[length/2]+(float)data2[length/2-1])/2;
            }else
                return data2[length/2];
        }else{
            if (n==0){
                if (length%2==0){
                    return ((float)data1[length/2]+(float)data1[length/2-1])/2;
                }else
                    return data1[length/2];
            }
        }
        while (count<=length/2){
                if((i<m && j<n && data1[i]<=data2[j])||(j>=n)){
                    preK = k;
                    k = data1[i];
                    ++i;
                }else{
                    if((i<m && j<n && data1[i]>data2[j])||(i>=m)){
                        preK = k;
                        k = data2[j];
                        ++j;
                    }
                }

            ++count;
        }
        if (length%2 == 1){
            return k;
        }else {
            return (k+preK)/2;
        }
    }
}
