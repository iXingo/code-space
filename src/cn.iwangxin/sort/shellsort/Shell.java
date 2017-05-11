package cn.iwangxin.sort.shellsort;

import cn.wangxin.sort.template.SortTemplate;

/**
 * Created by 汪欣 on 2017/02/16.
 */
public class Shell extends SortTemplate{
    @Override
    public void sort(Comparable[] data) {
        int h =1;
        while(h < data.length / 3) h =3 * h +1;
        while(h >= 1){
            for(int i =h; i < data.length;i++){
                for(int j=i;j >= h && less(data[j],data[j-h]);j -= h){
                    exch(data,j,j-h);
                }
            }
            h= h/3;
        }
    }
}
