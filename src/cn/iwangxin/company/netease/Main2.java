package cn.iwangxin.company.netease;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if(n <= 0) return;
            int i = 0;
            ArrayList<Integer> list = new ArrayList();
            while(i++ < n){
                list.add(in.nextInt());
                Collections.reverse(list);
            }
            for(int m = 0;m<list.size();m++){
                System.out.print(list.get(m));
                if(m < list.size() -1) System.out.print(" ");
            }
        }
    }
}
