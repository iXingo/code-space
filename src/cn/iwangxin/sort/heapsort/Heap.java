package cn.iwangxin.sort.heapsort;

import cn.iwangxin.sort.template.SortTemplate;


/**
 * Created by 汪欣 on 2017/02/18.
 */
public class Heap extends SortTemplate {
    @Override
    public void sort(Comparable[] data) {
        int n = data.length -1;
        for (int k = n/2 - 1; k >= 0; k--)
            sink(data, k, n);
        while (n > 1) {
            exch(data, 1, n--);
            sink(data, 1, n);
        }
    }

    private static void sink(Comparable[] data, int k, int n) {
        while (2 * (k-1) <= n) {
            int j = 2 * (k-1) - 1;
            if (j < n-1  && less(data[j], data[j+1])) j++;
            if (!less(data[k -1], data[j])) break;
            exch(data, k, j);
            k = j;
        }
    }

}
