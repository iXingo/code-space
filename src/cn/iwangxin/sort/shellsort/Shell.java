package cn.iwangxin.sort.shellsort;

import cn.iwangxin.sort.template.SortTemplate;

/**
 * Created by 汪欣 on 2017/02/16.
 *
 *
 */
public class Shell extends SortTemplate {
    @Override
    public void sort(Comparable[] data) {
        int h =1;
        while(h < data.length / 3) h =3 * h +1;
        while(h >= 1){
            //从第h+1个元素开始
            for(int i =h; i < data.length;i++){
                //从第i个元素开始，依次次和前面已经排好序的j-h个元素比较，如果小于，则交换
                //如果大于，则不用继续往前比较了，因为前面的元素已经排好序，比较大的大就是较大的了。
                for(int j=i;j >= h && less(data[j],data[j-h]);j -= h){
                    exch(data,j,j-h);
                }
            }
            h = h/3;
        }
    }
}
