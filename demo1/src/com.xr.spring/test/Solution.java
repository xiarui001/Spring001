package com.xr.spring.test;

import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.Permutation("a");

    }
    public ArrayList<String> array = new  ArrayList<String>();
    public ArrayList<String> Permutation(String str) {
        char[] c = str.toCharArray();
        LinkedList<Character> list = new LinkedList<Character>();
        recursion(c,list);
        return array;
    }

    public void recursion(char[] c, LinkedList<Character> list){
        if(list.size()==c.length){
            array.add(listToStr(list));
            return;
        }
        for(int i=0; i<c.length; i++){
            if(list.contains(c[i])) continue;
            list.add(c[i]);
            recursion(c,list);
            list.removeLast();
        }
    }

    public String listToStr(LinkedList<Character> list){
        String s = "";
        for(int i=0; i<list.size();i++){
            s += list.get(i);
        }
        return s;
    }


}