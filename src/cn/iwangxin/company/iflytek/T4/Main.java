package cn.iwangxin.company.iflytek.T4;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by Administrator on 2017/9/14.
 */
public class Main {

    public static void getConflictLesson(){


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String key = scanner.next();
        String val = scanner.next();
        getResult(n,key,val);

    }

    public static void getResult(int n, String key,String value){
        LinkedHashMap<String,ArrayList<String>> map = new LinkedHashMap<>();
        ArrayList<String> confilctKey = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(map.get(key)!=null){
                confilctKey.add(key);
                map.get(key).add(value);
            }else {
                map.put(key,new ArrayList<String>());
                map.get(key).add(value);
            }
        }
        if(confilctKey.size()==0){
            System.out.println("YES");
            return;
        }
        for(String str:confilctKey){
            System.out.print(str+" ");
            for(String str2:map.get(str)){
                System.out.print(str2+" ");
            }
            System.out.println();
        }

    }
}

