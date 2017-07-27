package com.jmarkstar.java.strings;

import java.util.Scanner;

/** Check if the word is palindrome.
 * Created by jmarkstar on 16/01/2017.
 */
public class java_string_reverse {

    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char [] arr = A.toCharArray();
        char [] reverse = new char[arr.length];
        for(int i=arr.length-1, j=0; i>=0 && j<reverse.length;i--, j++){
            reverse[j] = arr[i];
        }
        String A_reverse = new String(reverse);
        if(A.equals(A_reverse)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
