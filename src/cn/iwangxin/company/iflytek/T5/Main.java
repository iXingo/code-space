package cn.iwangxin.company.iflytek.T5;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Character> list=new ArrayList<Character>();
		while(in.hasNext()){
			String string=in.nextLine();
            for(int i=0;i<string.length();i++){
			    list.add(string.charAt(i));
		    }
			getReslut(string,list);
		}
	}

	private static void getReslut(String s,ArrayList<Character> list){
		for(int i=0;i<list.size()-1&&i>=0;i++){
			char a=list.get(i);
			char b=list.get(i+1);
			if(a=='R'&&b=='L'){
				boolean boo=false;
				for(int j=i+2;j<list.size();j++){
					if(list.get(j)=='L'){
						boo=true;
						break;
					}
				}
				if(boo){
					list.remove(i+1);
					i--;
				}else{
					list.remove(i);
					i--;
					i--;

				}
			}
		}
        System.out.println(list.size());
	}
}
