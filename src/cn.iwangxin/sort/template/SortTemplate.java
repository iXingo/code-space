package cn.iwangxin.sort.template;

/**
 * Created by 汪欣 on 2017/02/16.
 */
public abstract class SortTemplate {
    public abstract void sort(Comparable[] data);
    public static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }
    public static void exch(Comparable[] data,int i,int j){
        Comparable t = data[i];
        data[i] = data[j];
        data[j] = t;
    }
    public static void show(Comparable[] data){
        for(int i = 0 ;i < data.length ;i ++){
            System.out.print(data[i]+" ");

        }
        System.out.println();
    }
    public static boolean isSorted(Comparable[] data){
        for(int i = 1;i < data.length ;i++){
            if(less(data[i],data[i -1])){
                return false;
            }
        }
        return true;
    }
}
