package com.jmarkstar.datastructures;

import java.util.Scanner;

/**
 * Created by jmarkstar on 17/01/2017.
 */
public class Array_DS {

    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        String result = "";
        for(int i=arr.length-1; i>=0;i--){
            result = result+arr[i]+" ";
        }
        System.out.println(result.trim());
        scan.close();
    }
}
