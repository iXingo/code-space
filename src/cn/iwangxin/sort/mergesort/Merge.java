package cn.iwangxin.sort.mergesort;

import cn.iwangxin.sort.template.SortTemplate;

/**
 * Created by 汪欣 on 2017/02/17.
 */
public class Merge extends SortTemplate {
    private static Comparable[] aux;
    @Override
    public void sort(Comparable[] data){
        aux =new Comparable[data.length];
        sort(data,0,data.length -1 );
    }
    private static void sort(Comparable[] data,int lo,int hi){
        if(hi <= lo ) return;
        int mid = lo + (hi-lo)/2;
        sort(data,lo,mid);
        sort(data,mid+1,hi);
        merge(data,lo,mid,hi);
    }
    public static void merge(Comparable[] data,int lo,int mid,int hi){
        int i =lo,j=mid+1;

        for(int k=lo;k <= hi;k++) aux[k] = data[k];
        for(int k=lo;k <= hi;k++) {
            if (i > mid) data[k] = aux[j++];
            else if (j > hi) data[k] =aux[i++];
            else if (less(aux[j],aux[i])) data[k] = aux[j++];
            else data[k] = aux[i++];
        }
    }
}
