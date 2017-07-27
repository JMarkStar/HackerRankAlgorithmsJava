package com.jmarkstar.java.strings;

import java.util.Scanner;

/**
 * Created by jmarkstar on 16/01/2017.
 */
public class java_substring {

    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
