package cn.iwangxin.offer.PrintMinNumber;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static String PrintMinNumber(int [] numbers) {
        StringBuilder sb = new StringBuilder();
        int m =numbers.length;
        Integer[] n = new Integer[m];
        for(int i = 0;i< m;i++){
            n[i] = Integer.valueOf(numbers[i]);
        }
        Arrays.sort(n, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1=o1+""+o2;
                String s2=o2+""+o1;
                return s1.compareTo(s2);
            }
        });
        for(int i =0; i < m;i++){
            sb.append(n[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(PrintMinNumber(new int[]{3334,3,3333332}));
    }
}
