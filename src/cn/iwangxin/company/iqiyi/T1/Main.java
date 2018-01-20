package cn.iwangxin.company.iqiyi.T1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		int k = scan.nextInt();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int len = line.length();
		for(int i=0;i<len;i++){
			char ch = line.charAt(i);
			if(map.containsKey(ch)){
				int t = map.get(ch);
				map.put(ch, t+1);
			}else{
				map.put(ch, 1);
			}
		}
		int [] a = new int[map.size()];
		int cur = 0;
		for(int i : map.values()){
			a[cur++] = i;
		}
		for(int i=0;i<k;i++){
			Arrays.sort(a);
			a[cur-1]--;
		}
		int s = 0;
		for(int i=0;i<cur;i++){
			s += a[i]*a[i];
		}
		System.out.println(s);
	}
}

