package cn.iwangxin.sort;

import cn.iwangxin.sort.heapsort.Heap;
import cn.iwangxin.sort.shellsort.Shell;
import cn.iwangxin.sort.template.SortTemplate;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        SortTemplate sortAlgoithm = new Shell();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String string = s.nextLine();
        System.out.println(">>>" + string);
        String[] str = string.split(" ");
        sortAlgoithm.sort(str);
        //assert(SortTemplate.isSorted(str));
        SortTemplate.show(str);
    }
}
