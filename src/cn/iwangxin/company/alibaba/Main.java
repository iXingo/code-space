package cn.iwangxin.company.alibaba;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/** 请完成下面这个process函数，实现题目要求的功能 **/
    /**
     * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
     **/
    static int CUSTOMS_LIMIT_MONEY_PER_BOX = 1000;
    static Model[] items;
    static boxTemplate boxTemplate;

    static class UsedBox{
        int usedLength;
        int usedWidth;
        int usedHeight;
    }


    private static int process() {
        //保存已使用的箱子
        int count = -1;
        //维护一个列表N，保存已使用的箱子中已经还剩下的长宽高
        ArrayList<UsedBox> usedBox = new ArrayList();
        for (int i = 0; i < items.length; i++) {
            //如果有任何一个商品的长宽高都比箱子大，则该商品无法装箱，返回-1；
            if(items[i].length > boxTemplate.length || items[i].width > boxTemplate.width || items[i].length > boxTemplate.height)
                return -1;
            else{
                //根据商品的长宽高排序
                //如果箱子长满足
                if(count == 0) {
                    UsedBox used = new UsedBox();
                    used.usedLength = boxTemplate.length;
                    used.usedWidth = boxTemplate.width;
                    used.usedHeight = boxTemplate.height;
                    usedBox.add(used);
                    count++;
                }
                if(items[i].length < usedBox.get(count).usedLength){

                    usedBox.get(count).usedLength = boxTemplate.length - items[i].length;
                    if(items[i].width < usedBox.get(count).usedWidth){
                        usedBox.get(count).usedWidth = boxTemplate.width - items[i].width;
                        if(items[i].height < usedBox.get(count).usedHeight){
                            usedBox.get(count).usedHeight = boxTemplate.height - items[i].height;
                        }
                        else{
                            UsedBox used = new UsedBox();
                            used.usedLength = boxTemplate.length;
                            used.usedWidth = boxTemplate.width;
                            used.usedHeight = boxTemplate.height;
                            usedBox.add(used);
                            count++;
                        }
                    }
                    else{
                        UsedBox used = new UsedBox();
                        used.usedLength = boxTemplate.length;
                        used.usedWidth = boxTemplate.width;
                        used.usedHeight = boxTemplate.height;
                        usedBox.add(used);
                        count++;
                    }
                }
                else{
                    UsedBox used = new UsedBox();
                    used.usedLength = boxTemplate.length;
                    used.usedWidth = boxTemplate.width;
                    used.usedHeight = boxTemplate.height;
                    usedBox.add(used);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        boxTemplate.price = CUSTOMS_LIMIT_MONEY_PER_BOX;
        Model[] items;
        int boxMinNum;

        while (scanner.hasNext()) {
            boxTemplate.length = scanner.nextInt();
            boxTemplate.width = scanner.nextInt();
            boxTemplate.height = scanner.nextInt();

            int itemNum = scanner.nextInt();
            items = new Model[itemNum];
            for (int i = 0; i < itemNum; i++) {
                Model item = new Model();
                item.price = scanner.nextInt();
                item.length = scanner.nextInt();
                item.width = scanner.nextInt();
                item.height = scanner.nextInt();
                items[i] = item;
            }
            long startTime = System.currentTimeMillis();
            boxMinNum = Integer.MAX_VALUE;
            System.out.println(process());

        }
    }

}
