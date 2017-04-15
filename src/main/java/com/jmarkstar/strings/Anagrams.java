package com.jmarkstar.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jmarkstar on 14/04/2017.
 */
public class Anagrams {

    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String a, String b) {
        if(a.length() == b.length()){
            a = a.toLowerCase();
            b = b.toLowerCase();
            char [] Aarray = a.toCharArray();
            char Barray [] = b.toCharArray();
            Arrays.sort(Aarray);
            Arrays.sort(Barray);
            return Arrays.equals(Aarray, Barray);
        }
        return false;
    }
}
