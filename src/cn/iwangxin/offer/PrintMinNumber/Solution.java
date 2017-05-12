package cn.iwangxin.offer.PrintMinNumber;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static String PrintMinNumber(int [] numbers) {
        StringBuilder sb = new StringBuilder();
        Integer[] n = new Integer[numbers.length];
        for(int i = 0;i< numbers.length;i++){
            n[i] = Integer.valueOf(numbers[i]);
        }
        Arrays.sort(n, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1=o1+""+o2;
                String s2=o2+""+o2;
                return s1.compareTo(s2);
            }
        });
        for(int i = numbers.length-1; i >= 0;i--){
            sb.append(numbers[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(PrintMinNumber(new int[]{3,5,1,4,2}));
    }
}
