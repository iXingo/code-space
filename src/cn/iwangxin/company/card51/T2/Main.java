//package cn.iwangxin.company.card51.T2;
//
//public class Main {
//
//
//    void bignum_float(String str1, String str2)
//{
//    int length1 = str1.length();
//    int length2 = str2.length();
//    int flnum = -1;   //大数1的小数点位数
//    int flnum2 =-1;   //数2的小数点位数
//    char num1[] = new char[500];
//    char num2[] = new char[500];
//    int i, l;
//    for (i=0,l=0; l < length1;i++,l++)
//    {
//        if (str1.charAt(l) == '.') //遇到小数点后 开始加一
//        {
//            flnum++;
//            i--;
//            continue;
//        }
//        if (flnum!=-1) flnum++; //统计小数点后的位数，由于会多加一次，所以初始值为-1
//        num1[i] = str1.charAt(l);  //保存到新的数组里
//    }
//
//    for (i = 0,l = 0; l < length2; i++, l++)
//    {
//        if (str2.charAt(l) == '.')
//        {
//            flnum2++;
//            i--;
//            continue;
//        }
//        if (flnum2!=-1) flnum2++;
//        num2[i] = str2.charAt(l);
//    }
//    if (flnum!=-1) length1 -= 1;   //如果数字存在小数点，则转化为整数后对应的长度-1
//    if (flnum2!=-1) length2 -= 1;
//    flnum = flnum + flnum2;
//    char[] res = new char[length1 + length2];
//
//    for (i = length1-1; i>=0;i--)
//    for (l=length2-1; l >= 0; l--)
//        {
//            res[i+l+1]+=(num1[i] - '0')*(num2[l] - '0');
//            res[i + l] += res[i + l + 1] / 10;
//            res[i + l + 1] %= 10;
//        }
//    int count = 0;
//    while (res[count] == 0)
//    {
//        count++;
//    }
//    char[] ret =new char[length1 + length2+2];
//    for (int n=0,l = 0, i=count; i < length1 + length2; l++, i++,n++)
//    {
//        if (n == length1 + length2 -count-flnum)   //在结果对应的位置加上小数点
//        {
//            ret[l] = '.';
//            i--;
//            continue;
//        }
//        ret[l] = res[i] + '0';
//    }
//    System.out.println(ret);
//}
//
//}
