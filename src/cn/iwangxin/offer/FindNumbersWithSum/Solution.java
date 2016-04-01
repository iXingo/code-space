package cn.iwangxin.offer.FindNumbersWithSum;

/**
 * Created by 汪欣 on 2017/06/06.
 */
import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList list = new ArrayList();
        int max = Integer.MAX_VALUE;
        int b =max;
        int a = max;
        for(int i = 0;i <array.length;i++){
            for(int j = array.length -1 ;j > i;j--){
                if(array[i]+array[j] ==sum) {
                    if(max > array[i]*array[j]) {
                        a= array[i];
                        b= array[j];
                        max = array[i] * array[j];
                    }
                }
            }
        }
        if(a==Integer.MAX_VALUE&& b==Integer.MAX_VALUE) return null;
        else {
            list.add(a);
            list.add(b);
            return list;
        }
    }

    public static void main(String[] args) {
        System.out.println(FindNumbersWithSum(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},21));
    }
}