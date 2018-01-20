package cn.iwangxin.company.card51.T1;

import java.util.*;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		for(int i=0;i<n;i++){
			Long num = scan.nextLong();
			if(map.containsKey(num)){
				int count = map.get(num);
				map.put(num, count+1);
			}else map.put(num, 1);
		}
		int maxNum = 0;
		for(int i : map.values()){
			maxNum = i>maxNum?i:maxNum;
		}
		PriorityQueue<Long> queue = new PriorityQueue(1);
		for(Map.Entry<Long, Integer> entry : map.entrySet()){
			if(entry.getValue().equals(maxNum)) queue.add(entry.getKey());
		}
		System.out.println(queue.peek());
    }
}
