package cn.iwangxin.company.wap.T2;

import java.util.Scanner;

public class Main {

    private static int[] elements;
    private static int head ;
    private static int tail;
    private static int capability;
    private static int size;
    
    public static void main(String[] args) {
        head = 0;
        tail = 1;
        capability = 0;
        size = 8;
        elements = new int[size];
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.nextLine();
            }
            for (int i = 0; i < n; i++) {
                operation(str[i]);
            }
        }
    }

    public static void operation(String operation){
        if(operation.contains("pop_back")){
            pop_back(operation);
            System.out.println(operation);
        }
        if(operation.contains("pop_front")){
            pop_front(operation);
            System.out.println(operation);
        }
        if(operation.contains("push_front")){
            push_front(operation);
            System.out.println(operation);
        }
        if(operation.contains("push_back")){
            push_back(operation);
            System.out.println(operation);
        }
        if(operation.contains("reverse")){
            reverse(operation);
            System.out.println(operation);
        }
        if(operation.contains("max")){
            max(operation);
            System.out.println(operation);
        }
        
    }

    private static void reverse(String operation) {
        for (int i = 0; i < capability/2; i++) {
            int temp = elements[i];
            elements[i] = elements[capability -i -1];
            elements[capability -i -1] = temp;
        }
    }

    private static void max(String operation) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < capability; i++) {
            max = max > elements[i] ?max :elements[i];
        }
        System.out.println(max);
    }

    private static void push_back(String operation) {
        String[] op = operation.split(" ");
        int value = Integer.parseInt(op[1]);
        int tails = tail+1;
        if(tails<size-1){

            elements[tail] = value;
            tail++;
            capability++;
        }else{
            size *= 2;
            int[] newelement = new int[size];
            for (int i = 0; i < elements.length; i++) {
                newelement[i] = elements[i];
            }
            elements = newelement;
            elements[tail] = value;
            tail++;
            capability++;
        }
    }

    private static void push_front(String operation) {
        String[] op = operation.split(" ");
        int value = Integer.parseInt(op[1]);
        int heads = head -1;
        if(heads > 0){
            elements[head] = value;
            head--;
            capability++;
        }
        else{
            int[] newelement = new int[++size];
            newelement[0] = value;
            for (int i = 0; i < elements.length; i++) {
                newelement[i+1] = elements[i];
            }
            elements = newelement;
            capability++;
            head = 0;
        }
    }

    private static void pop_front(String operation) {
        if(capability == 0) {
            System.out.println("ERROR");
            return;
        }
        System.out.println(elements[head]);
        head++;
    }

    private static void pop_back(String operation) {
        if(capability == 0) {
            System.out.println("ERROR");
            return;
        }
        System.out.println(elements[tail]);
        tail--;
    }
}
