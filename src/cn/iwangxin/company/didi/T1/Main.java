package cn.iwangxin.company.didi.T1;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = null;
        while (in.hasNext()) {
            String s = in.nextLine();
            str = s.split(" ");
            break;
        }
        int[] data = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            data[i] = Integer.parseInt(str[i]);
        }
        System.out.println(findMaxSubStringSum(data));
    }

    public static int findMaxSubStringSum(int[] num){
//		int Maxium = num[0];
//		int result = 0;
//		for (int i = 0; i < num.length; i++) {
//			result += num[i];
//			if (result > Maxium) {
//				Maxium = result;
//			}
//			if (num[i]<0) {
//				result = 0;
//			}
//		}
//		return Maxium;
        int sum=0,
        maxium = Integer.MIN_VALUE;
        for(int i = 0;i <num.length;i++)
        {
            sum += num[i];
            if(sum > maxium)
                maxium = sum;
            else if(sum < 0)
                sum = 0;
        }
        return maxium;
    }
}
