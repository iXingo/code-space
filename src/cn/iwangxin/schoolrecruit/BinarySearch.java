package cn.iwangxin.schoolrecruit;

public class BinarySearch {
    public static int getPos(int[] A, int n, int val) {
        return binarySearch(A, 0, n-1,val);
    }

    public static int binarySearch(int[] A, int low, int high,int val) {
        int mid;
        while(low <= high) {
            mid = low + ((high-low) >> 1);
            if(val <= A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low < A.length ? low : -1;
    }
    public static void main(String[] args){
        System.out.println(getPos(new int[]{1,3,5,7,9}, 5, 10));
    }
}