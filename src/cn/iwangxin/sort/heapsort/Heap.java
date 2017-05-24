package cn.iwangxin.sort.heapsort;

import cn.iwangxin.sort.template.SortTemplate;

import java.util.Arrays;


/**
 * 元素k的父节点所在的位置为[k/2]
 * 元素k的子节点所在的位置为2k和2k+1
 * Created by 汪欣 on 2017/02/18.
 */
public class Heap extends SortTemplate {
    @Override
    public void sort(Comparable[] data) {
        int n = data.length - 1;
        //分别对叶子结点的上一级节点以重上之下的方式重建堆
        for (int k = n/2; k >= 0; k--)
            sink(data, k, n);
        //二叉堆排序其实就是循环移除顶部元素到数组末尾，然后利用Sink重建堆的操作
        while (n > 0) {
            exch(data, 0, n--);
            sink(data, 0, n);
        }
    }

    /**
     * 自上而下的有序化（下沉）的实现
     * 当某一节点比其子节点要小的时候，就违反了二叉堆的定义，需要和其子节点进行交换以重新建堆，直到该节点都大于其子节点为止：
     * @param data
     * @param k
     * @param n
     */
    private static void sink(Comparable[] data, int k, int n) {
        while (2 * k <= n) {
            int j = 2 * k;
            //取左右子节点中，稍大的那个元素做比较
            if (j < n  && less(data[j], data[j+1])) j++;
            //如果父节点比这个较大的元素还大，表示满足要求，退出
            if (!less(data[k], data[j])) break;
            //否则，与子节点进行交换
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
        //如果元素比其父元素大，则交换
        while( k>1 && less(k/2,k)){
            exch(data,k/2,k);
            k = k/2;
        }
    }

}
