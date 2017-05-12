package cn.iwangxin.leetcode.evaluatereversepolishnotation;



/**
 * Created by 汪欣 on 2017/03/21.
 */
import java.util.*;

public class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        if(tokens.length == 1){return Integer.parseInt(tokens[0]);}
        Stack stack = new Stack();
        for(int i = 0;i< tokens.length;i++){
            if(tokens[i].equals("+")){
                stack.push(tokens[i]);
                stack.pop();
                int a = Integer.parseInt(stack.pop().toString());
                int b = Integer.parseInt(stack.pop().toString());
                result = b + a;
                stack.push(result);
            }
            else if(tokens[i].equals("-")){
                stack.push(tokens[i]);
                stack.pop();
                int a = Integer.parseInt(stack.pop().toString());
                int b = Integer.parseInt(stack.pop().toString());
                result = b - a;
                stack.push(result);
            }
            else if(tokens[i].equals("*")){
                stack.push(tokens[i]);
                stack.pop();
                int a = Integer.parseInt(stack.pop().toString());
                int b = Integer.parseInt(stack.pop().toString());
                result = b * a;
                stack.push(result);
            }
            else if(tokens[i].equals("/")){
                stack.push(tokens[i]);
                stack.pop();
                int a = Integer.parseInt(stack.pop().toString());
                int b = Integer.parseInt(stack.pop().toString());
                result = b / a;
                stack.push(result);
            }
            else stack.push(tokens[i]);
        }
        return result;
    }
    public static void main(String[] args){
        String[] str = new String[]{"2","1","+","3","*"};
        Solution s = new Solution();
        System.out.println(s.evalRPN(str));
    }
}

