package cn.iwangxin.company.jingdong.T1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = null;
        while (in.hasNext()) {
            string = in.nextLine();
            break;
        }
        int count = 0;
        int result = 1;
        for (int j = 0; j < string.length(); j++) {
            if(string.charAt(j) == '(' && j< string.length() -1) {
                if(string.charAt(j+1) != ')'){
                    count++;
                }
                else{
                    count++;
                    result *= calc(count);
                    count = 0;
                }
            }
        }


        System.out.println(result);
    }


    private static int calc(int n) {
        int result = 1;
        while(n > 0){
            result *= n;
            n--;
        }
        return result;
    }
}