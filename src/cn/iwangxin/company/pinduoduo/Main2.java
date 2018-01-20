package cn.iwangxin.company.pinduoduo;

import java.util.*;

public class Main2 {

    static class Path{
        String name;
        int parentLevel;
        public Path(String name,int level){
            this.name = name;
            this.parentLevel = level;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            ArrayList<Path> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] str = in.nextLine().split(" ");
                String name = str[0];
                int parentLevel = Integer.parseInt(str[1]);
                list.add(new Path(name,parentLevel));
            }
            Collections.sort(list, new Comparator<Path>() {
                @Override
                public int compare(Path o1, Path o2) {
                    return o1.parentLevel - o2.parentLevel;
                }
            });

            getResult(list);
        }
    }

    private static void getResult(ArrayList<Path> list) {
        Queue<Path> q = new LinkedList<>();

    }
}
