package cn.iwangxin.schoolrecruit;


import java.util.LinkedHashMap;

public class FirstRepeat {

    public static char findFirstRepeat(String A, int n) {
        // write code here
        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<Character,Integer>();
        char ch = ' ';
        for(char c: A.toCharArray()){
            int num = 0;
            if(hashMap.containsKey(c)) {
                num = hashMap.get(c)+1;
                ch = c;
                if (num == 2) break;
                hashMap.put(c,num);

            }
            else hashMap.put(c,++num);
        }
        return ch;
    }
    public static void main(String[] args){
        char c = findFirstRepeat("qywyer23tdd", 11);
        System.out.println(c);
    }
}
