package cn.iwangxin.leetcode;

public class BinarySearch {
    public static int getPos(int[] A, int n, int val) {
        return binarySearch(A, 0, n-1,val);
    }

    public static int binarySearch(int[] A, int low, int high,int val) {
        int mid = (high-low)/2;
        if(A[mid] == val) return mid;
        else if(A[mid] < val)
        {
            low = mid;
            return binarySearch(A, low, high, val);
        }
        else
        {
            high = mid;
            return binarySearch(A, low, high, val);
        }
    }
    public static void main(String[] args){
        System.out.println(getPos(new int[]{1,3,5,7,9}, 5, 7));
    }
}