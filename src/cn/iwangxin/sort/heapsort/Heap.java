package cn.iwangxin.sort.heapsort;

import cn.iwangxin.sort.template.SortTemplate;

import java.util.Arrays;


/**
 * Created by 汪欣 on 2017/02/18.
 */
public class Heap extends SortTemplate {
    @Override
    public void sort(Comparable[] data) {
        int n = data.length -1;
        //分别对叶子结点的上一级节点以重上之下的方式重建堆
        for (int k = n/2 - 1; k >= 0; k--)
            sink(data, k, n);
        //二叉堆排序其实就是循环移除顶部元素到数组末尾，然后利用Sink重建堆的操作
        while (n > 1) {
            exch(data, 1, n--);
            sink(data, 1, n);
        }
    }

    /**
     * 自上而下的有序化（下沉）的实现
     * @param data
     * @param k
     * @param n
     */
    private static void sink(Comparable[] data, int k, int n) {
        while (2 * (k-1) <= n) {
            int j = 2 * (k-1) - 1;
            if (j < n-1  && less(data[j], data[j+1])) j++;
            if (!less(data[k -1], data[j])) break;
            exch(data, k, j);
            k = j;
        }
    }

    /**
     * 自下而上的有序化（上浮）的实现
     * @param data
     * @param k
     */
    public static void swim(Comparable[] data,int k){
        //元素k与其父节点k/2比较，如果比父元素大，则交换，然后迭代，一直到比父元素小为止。
        while( k>1 && less(k/2,k)){
            exch(data,k/2,k);
            k = k/2;
        }
    }

}
