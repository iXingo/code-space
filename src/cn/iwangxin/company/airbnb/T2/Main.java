package cn.iwangxin.company.airbnb.T2;

import java.util.Stack;

public class Main {
    static int[] meet(String[] wizards) {
        Stack<Integer> stack = new Stack();
        int count = 0;
        int target = 0;
        int source = 0;
        for (int i = 0; i < wizards.length; i++) {
            for (int j = 0; j < wizards[i].length(); j++) {
                if (wizards[i].charAt(j) == '9') {
                    target = i;
                    stack.push(9);
                    stack.push(target);
                    continue;
                }
            }
        }
        if(count == 0) return new int[]{0};
        while(target != source){
            for(int i = target;i >= 0;i--){
                for (int j = 0; j < wizards[i].length(); j++) {
                if (String.valueOf(wizards[i].charAt(j)) == String.valueOf(target)) {
                    target = i;
                    stack.push(target);
                } }
            }
        }
        int[] path = new int[stack.size()];
        int i =0;
        for (Integer integer: stack
             ) {
            path[i++] = integer;
        }
        return path;
    }
}
