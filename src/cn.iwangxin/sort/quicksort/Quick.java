package cn.iwangxin.sort.quicksort;

import cn.iwangxin.sort.template.SortTemplate;

/**
 * Created by 汪欣 on 2017/02/17.
 */
public class Quick extends SortTemplate{
    @Override
    public void sort(Comparable[] data) {
        sort(data,0,data.length -1);
    }

    private static void sort(Comparable[] data, int lo, int hi) {
        if(hi <= lo) return;
        int j = partition(data,lo,hi);
        sort(data,lo ,j-1);
        sort(data,j+1,hi);
    }

    private static int partition(Comparable[] data,int lo ,int hi){
        int i = lo,j= hi + 1;
        Comparable v =data[lo];
        while(true){
            while(less(data[++i],v)) if(i == hi) break;
            while(less(v,data[--j])) if(j == lo) break;
            if(i >= j) break;
            exch(data,i,j);
        }
        exch(data,lo,j);
        return j;
    }
}
