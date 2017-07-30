package com.jmarkstar.algorithms.implementation;

import java.util.Scanner;

/** 16 32 96 | 2
 *   8 16 48 | 2
 *   4  8 24 | 2
 *   2  4 12 | 2
 * Created by jmarkstar on 27/07/2017.
 */
public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b){
        int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for(int i=f;i<=l;i+=f){
            if(l%i==0){ count++;}
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }

    private static int gcd(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }

    private static int gcd(int a, int b){
        if(b==0)return a;
        else return gcd(b, a%b);
    }

    private static int lcm(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }

    private static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
