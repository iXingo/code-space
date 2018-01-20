package cn.iwangxin.company.card51;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String[] bigNum = new String[2];
            bigNum[0] = in.next();
            bigNum[1] = in.next();
            System.out.println(bigMultiply(bigNum[0], bigNum[1]));
        }
    }

    static String bigMultiply(String one, String two) {
        boolean flag = false;
        //如果为负数
        if (one.charAt(0) == '-') {
            flag = !flag;
            one = one.substring(1);
        }
        //如果为负数
        if (two.charAt(0) == '-') {
            flag = !flag;
            two = two.substring(1);
        }

        int index1 = one.indexOf('.');
        if(index1==-1){
            StringBuilder sb  =new StringBuilder(one);
            sb.append(".");
            sb.append("0");
            one = sb.toString();
        }

        int index2 = one.indexOf('.');
        if(index2==-1){
            StringBuilder sb  =new StringBuilder(two);
            sb.append(".");
            sb.append("0");
            two = sb.toString();
        }

        // 小数点的位置
        int aPointLoc = one.length() - one.indexOf('.') - 1;
        int bPointLoc = two.length() - two.indexOf('.') - 1;
        int pointPos = aPointLoc + bPointLoc; // 结果的小数点位置

        // 删除小数点
        StringBuffer stringBufferA = new StringBuffer(one.replaceAll("\\.", ""));
        StringBuffer stringBufferB = new StringBuffer(two.replaceAll("\\.", ""));

        int[] a = stringToInteger(stringBufferA.toString());
        int[] b = stringToInteger(stringBufferB.toString());

        int[] result = new int[a.length + b.length - 1]; // 保存结果的数组

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                result[i + j] += a[i] * b[j];
            }
        }

        for (int i = result.length - 1; i >= 0; --i) {
            if (result[i] > 9) {
                result[i - 1] += result[i] / 10;
                result[i] = result[i] % 10;
            }
        }

        StringBuffer buffer = new StringBuffer(); // 将result数组转换为字符串
        for (int i = 0; i < result.length; ++i) {
            // 添加小数点
            if(result.length - i == pointPos) {
                buffer.append(".");
            }
            buffer.append(String.valueOf(result[i]));
        }

        if (buffer.indexOf(".") != -1)
        {
            // 删除最开始的0
            int i = 0;
            while (i < buffer.length()) {
                if (buffer.length() > 2 && buffer.charAt(i+1) == '.') { // 小数点前只有一个数 0.
                    break;
                } else if (buffer.charAt(i) == '0') { // 删除最前边的0
                    buffer.deleteCharAt(i);
                    i = 0;
                    continue;
                } else { // 当第一位不是0的时候
                    break;
                }
            }

            // 删除末尾的0
            i = buffer.length() - 1;
            while (i >= 0) {
                if (buffer.length() > 2 && buffer.charAt(i-1) == '.') { // 小数点后直接是数字
                    break;
                } else if (buffer.charAt(i) == '0') { // 删除末尾的0
                    buffer.deleteCharAt(i);
                    i = buffer.length() - 1;
                    continue;
                } else { // 当最后一位不是0的时候
                    break;
                }
            }
        }

        // 根据符号位, 返回值的正负标志
        if (flag) {
            return "-" + buffer.toString();
        } else {
            return buffer.toString();
        }
    }


    private static int[] stringToInteger(String number) {
        Pattern pattern = Pattern.compile("^(-?\\d+|\\d*)\\.?\\d*$");
        Matcher matcher = pattern.matcher(number);
        if (!matcher.find()) {
            throw new IllegalArgumentException("");
        }

        int[] result = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            result[i] = (int) (number.charAt(i) - '0');
        }
        return result;
    }
}