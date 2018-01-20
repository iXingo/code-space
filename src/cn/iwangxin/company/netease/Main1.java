package cn.iwangxin.company.netease;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {//注意while处理多个case
            String s= in.nextLine();
            if(s.length() <= 1) {
                System.out.println(s.length());
                return;
            }
            if(s.length() == 2) {
                if(s.charAt(0)!=s.charAt(1)) System.out.println(2);
                else System.out.println(0);
            }
            int max = 0;
            for (int head = 0; head < s.length() - 2; head++) {
                int tail = head + 1;
                while(s.charAt(tail)!= s.charAt(tail-1) && tail < s.length() -1){
                    tail ++;
                    if(s.charAt(tail)!= s.charAt(tail-1)) {
                        max = tail - head +1> max ? tail-head +1:max;
                        if(max < 2) max =2;
                    }
                    else max = tail - head> max ? tail-head:max;
                }
            }
            System.out.println(max);

        }
    }
}
