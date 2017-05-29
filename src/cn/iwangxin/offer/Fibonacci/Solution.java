package cn.iwangxin.offer.Fibonacci;

/**
 * Created by 汪欣 on 2017/05/24.
 */
public class Solution {
    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int[] record = new int[n + 1];
        record[0] = 0;
        record[1] = 1;
        for (int i = 2; i <= n; i++) {
            record[i] = record[i - 1] + record[i - 2];
        }
        return record[n];

    }

    public static void main(String[] args) {
        System.out.println(new Solution().Fibonacci(2));
    }
}
