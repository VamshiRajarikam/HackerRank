package com.algorithms.leetcode;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DuplicateSocks {

    static int sockMerchant(int n, int[] ar) {
        int count=5;
        Map <Integer, Integer> socks = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            if(socks.containsKey(ar[i])){
                socks.put(ar[i],socks.get(ar[i])+1);
            }else{
                socks.put(ar[i],socks.get(ar[i])+1);
            }
        }
        Character [] v= {'v','a','m'};
//        Set <Character> pairSocks;
//        pairSocks.add(v);
//        for(int a : pairSocks){
//            if(pairSocks.get(a)==2){
//                count=count+1;
//                //pairSocks.
//            }
//            if(pairSocks.get(a)==4){
//                count=count+2;
//            }
//        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
