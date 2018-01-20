package cn.iwangxin.company.airbnb.T1;



public class Main {
     String minWindow(String s, String alphabet) {
        if(s.length()<alphabet.length()){
            return "";
        }
        for(int i=alphabet.length();i<=s.length();i++){
            for(int j=0;j+i<=s.length();j++){
                String str = s.substring(j, j+i);
                StringBuffer sb=new StringBuffer(str);
                int count=0;
                for(int k=0;k<alphabet.length();k++){
                    if(sb.indexOf(alphabet.charAt(k)+"")!=-1){
                        sb.deleteCharAt(sb.indexOf(alphabet.charAt(k)+""));
                        count++;
                    }else{
                        break;
                    }
                }
                if(count==alphabet.length()){
                    return str;
                }
            }
        }
        return "";
    }
}
