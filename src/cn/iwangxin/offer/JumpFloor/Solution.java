package cn.iwangxin.offer.JumpFloor;

/**
 * Created by 汪欣 on 2017/06/06.
 */
public class Solution {
    public static int JumpFloor(int target) {
        if(target < 2) return target;
        else {
            int[] num = new int[target+1];
            num[0]=0;num[1]=1;num[2]=2;
            for (int i = 3; i <= target; i++) {
                num[i] = num[i - 1] + num[i - 2];
            }
            return num[target];
        }

    }

}
