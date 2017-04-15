package com.jmarkstar.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by jmarkstar on 14/04/2017.
 */
public class String_Tokens {

    public static void main(String [] args ){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        StringTokenizer st = new StringTokenizer(s, "[ !,?._'@]");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
