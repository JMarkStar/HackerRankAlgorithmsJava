package com.jmarkstar.java.strings;

import java.util.Scanner;

/**
 * Created by jmarkstar on 16/01/2017.
 */
public class java_string_compare {

    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        String min = null, max = null;
        for(int i=0; i<=(s.length()-k); i++){
            int beginIndex = i;
            int endIndex = i+k;
            String substring = s.substring(beginIndex, endIndex);
            if(min==null){
                min = substring;
                max = substring;
            } else {
                min = min.compareTo(substring) <= 0? min : substring;
                max = max.compareTo(substring) >= 0? max : substring;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
