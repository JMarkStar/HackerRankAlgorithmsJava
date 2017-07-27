package com.jmarkstar.algorithms.warmup;

import java.util.Scanner;

/**
 *
 * @author jmarkstar
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            int spaces = n-i;
            int x = i;
            while(spaces>0){
                sb.append(" ");
                --spaces;
            }
            while(x>0){
                sb.append("#");
                --x;
            }
            System.out.println(sb.toString());
        }
    }
}

