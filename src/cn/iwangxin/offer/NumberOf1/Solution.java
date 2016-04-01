package cn.iwangxin.offer.NumberOf1;

/**
 * Created by 汪欣 on 2017/06/06.
 */
public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while(flag !=0){
            if((n & flag) != 0)
                count++;
            flag = flag<<1;
        }
        return count;
    }
}
