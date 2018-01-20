package cn.iwangxin.company.meili;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            System.out.println(dayCount(year,month,day));
        }
    }

    public static int dayCount(int year, int month, int day)
    {
        int sum = 0;
        switch (month - 1)
        {
            case 11:sum += 30;
            case 10:sum += 31;
            case 9: sum += 30;
            case 8: sum += 31;
            case 7: sum += 31;
            case 6: sum += 30;
            case 5: sum += 31;
            case 4: sum += 30;
            case 3: sum += 31;
            case 2: sum += 28;
            case 1: sum += 31;
            break;
            default:break;
        }

        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            if (month > 2) sum++;
        }
        sum += day;
        return sum;
    }
}
