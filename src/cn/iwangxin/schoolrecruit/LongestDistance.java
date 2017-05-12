package cn.iwangxin.schoolrecruit;

/**
 * Created by 汪欣 on 2017/05/12.
 */
public class LongestDistance {
    public static int getDis(int[] A, int n) {
        int max = 0;
        for(int i = 0; i< n;i++){
            for(int j = i;j <n;j++){
                max = max>=A[j]-A[i]?max:A[j]-A[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getDis(new int[]{10,5},2));
    }
}
