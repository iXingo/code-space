package cn.iwangxin.sort;

import cn.iwangxin.sort.heapsort.Heap;
import cn.iwangxin.sort.template.SortTemplate;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        SortTemplate sortAlgoithm = new Heap();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String strr = s.nextLine();
        System.out.println(">>>" + strr);
        String[] str = strr.split(" ");
        sortAlgoithm.sort(str);
        //assert(SortTemplate.isSorted(str));
        SortTemplate.show(str);
    }
}
