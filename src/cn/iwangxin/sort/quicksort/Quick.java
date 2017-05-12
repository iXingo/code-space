package cn.iwangxin.sort.quicksort;


import cn.iwangxin.sort.template.SortTemplate;

/**
 * Created by 汪欣 on 2017/02/17.
 */
public class Quick extends SortTemplate {
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
        //取第一个数作为基准
        Comparable v =data[lo];
        while(true){
            //左边的指针指向的数比V小则一直右移（直到i到达最后）
            while(less(data[++i],v)) if(i == hi) break;
            //右边的指针指向的数比V大则一直左移（直到i到达最前）
            while(less(v,data[--j])) if(j == lo) break;
            //左指针大于右指针，break
            if(i >= j) break;
            //交换i和j
            exch(data,i,j);
        }
        //交换最左边的数和j
        exch(data,lo,j);
        return j;
    }
}
