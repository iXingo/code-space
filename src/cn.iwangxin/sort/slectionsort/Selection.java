package cn.iwangxin.sort.slectionsort;

import cn.iwangxin.sort.template.SortTemplate;

/**
 * Created by 汪欣 on 2017/02/16.
 */
public class Selection extends SortTemplate {

    @Override
    public void sort(Comparable[] data) {
        for(int i =0;i < data.length; i++){
            int min = i;
            for(int j = i + 1;j< data.length; j++){
                if(less(data[j],data[min])){
                    min = j;
                }
            }
            exch(data,i,min);
        }
    }
}
