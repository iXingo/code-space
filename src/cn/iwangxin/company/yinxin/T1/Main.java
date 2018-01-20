package cn.iwangxin.company.yinxin.T1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String source = in.next();
            String target = in.next();
            int result = subStrlocation(source,target);
            System.out.println(result);
        }
    }

    public static int subStrlocation(String source, String target) {
        if(source.length() < target.length()) return -1;
        if (source == null || target == null) return -1;
        if (target.length() == 0) return 0;
        int i = 0,j=0;
        while (true) {
            if (source.charAt(i) == target.charAt(j)) {
                j++;
                i++;
            } else {
                if (j == 0){
                    i++;
                }
                j = 0;
            }
            if (j == target.length()) {
                return i - j;
            }
            if (i == source.length()) {
                break;
            }
        }
        return -1;
    }
}
