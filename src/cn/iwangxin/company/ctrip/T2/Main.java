package cn.iwangxin.company.ctrip.T2;

import java.util.HashSet;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


    }
    public int findArrayMex(int[] A, int n) {
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            if (A[i]>0&&A[i]<=n){
                data[A[i]-1]=1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (data[i]==0){
                return i+1;
            }
        }
        return n+1;
    }
}
