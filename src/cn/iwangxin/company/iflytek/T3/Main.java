package cn.iwangxin.company.iflytek.T3;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeMap<String, TreeSet<String>> stringTreeSetTreeMap = new TreeMap<String, TreeSet<String>>();
        for (int i = 0; i < n; i++) {
            String string1 = in.next();
            String string2 = in.next();
            if (stringTreeSetTreeMap.containsKey(string1)) {
                stringTreeSetTreeMap.get(string1).add(string2);
            } else {
                TreeSet list = new TreeSet();
                list.add(string2);
                stringTreeSetTreeMap.put(string1, list);
            }
        }
        boolean falg = false;
        for (Map.Entry<String, TreeSet<String>> stringTreeSetEntry : stringTreeSetTreeMap.entrySet()) {
            if (stringTreeSetEntry.getValue().size() > 1) {
                falg = true;
                System.out.print(stringTreeSetEntry.getKey());
                for (String s : stringTreeSetEntry.getValue()) {
                    System.out.print(" " + s);
                }
                System.out.println();
            }
        }
        if (!falg) {System.out.println("YES");}
    }
}