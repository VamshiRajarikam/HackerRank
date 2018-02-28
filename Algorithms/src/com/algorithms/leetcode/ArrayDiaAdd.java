package com.algorithms.leetcode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayDiaAdd {

    static int diagonalDifference(int[][] a) {
        int len=a.length, sum=0,sum1=0;
         for(int a_i = 0; a_i < len; a_i++){
            for(int a_j = 0; a_j < len; a_j++){
                if(a_i==a_j){
                sum=sum+a[a_i][a_j];
                }
                sum1=sum1+a[a_i][len-a_j-1];
            }
        }
        int diff= sum-sum1;
        return sum1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
