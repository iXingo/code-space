package cn.iwangxin.sort.insertsort;

import cn.wangxin.sort.template.SortTemplate;

/**
 * Created by 汪欣 on 2017/02/16.
 */
public class Insert extends SortTemplate{
    @Override
    public void sort(Comparable[] data) {
        for(int i=1;i < data.length;i++){
            for(int j=i;j > 0 && less(data[j],data[j-1]);j--){
                exch(data,j,j-1);
            }
        }
    }
}
