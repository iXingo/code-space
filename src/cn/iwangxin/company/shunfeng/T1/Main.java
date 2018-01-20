package cn.iwangxin.company.shunfeng.T1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static void solve(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length -1; i++) {
            b[i] = a[i] + a[i+1];
        }
        b[a.length-1] = a[a.length-1];
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);

        }
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = in.nextInt();
            }
            solve(data);
        }
    }
}

