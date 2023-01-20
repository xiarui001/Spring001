package com.xr.spring.test;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public LinkedList<Integer> list = new LinkedList<Integer>() ;
    public static void main(String[] args) {

        String s = "{}";
        char[] c = s.toCharArray();

       char c1 = 'a';
       char c2 = 'a';
        System.out.println(c1==c2);
        System.out.println(s);
        Stack<Character> stack = new Stack<>();
        stack.push(c[1]);
    }
}
