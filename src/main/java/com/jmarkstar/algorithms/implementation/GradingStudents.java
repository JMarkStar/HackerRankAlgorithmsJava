package com.jmarkstar.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by jmarkstar on 27/07/2017.
 */
public class GradingStudents {
    static int[] solve(int[] grades){
        for(int i=0;i<grades.length;i++){
            int number = grades[i];
            if(number>=38){
                int restMod10 = number%10;
                if(restMod10>=8){
                    number = (number-restMod10)+10;
                }else if(restMod10>= 3 && restMod10<5){
                    number = (number-restMod10)+5;
                }
                grades[i]=number;
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
