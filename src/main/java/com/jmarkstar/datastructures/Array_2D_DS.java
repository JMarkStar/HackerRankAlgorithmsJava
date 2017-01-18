package com.jmarkstar.datastructures;

import java.util.Scanner;

/**
 * Created by jmarkstar on 17/01/2017.
 */
public class Array_2D_DS {

    private static final int MAX_COLUMN = 6;
    private static final int MAX_ROW = 6;

    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        int [][] matrix = new int[MAX_ROW][MAX_COLUMN];
        for(int i=0; i<MAX_COLUMN;i++){
            for(int j=0; j<MAX_ROW;j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=MAX_ROW-3;i++){
            for(int j=0; j<=MAX_COLUMN-3;j++){
                int sum =  matrix[i][j]   +matrix[i][j+1]   + matrix[i][j+2]
                                          +matrix[i+1][j+1]
                          +matrix[i+2][j] +matrix[i+2][j+1] + matrix[i+2][j+2];
                max = sum > max ? sum : max;
            }
        }
        System.out.println(max);
        scan.close();
    }
}
