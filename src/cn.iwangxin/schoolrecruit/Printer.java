package cn.iwangxin.schoolrecruit;

public class Printer {
    public static int[] printMatrix(int[][] mat, int n, int m) {
        // write code here
        int[] matrix = new int[n*m];
        for(int i = 0;i< n;i++){
            for (int j = 0;j < m;j++){
                if(i%2 ==0){
                    matrix[i*m+j] = mat[i][j];
                }
                else matrix[i*m+j] = mat[i][m-j-1];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(printMatrix(mat,4,3));
    }
}