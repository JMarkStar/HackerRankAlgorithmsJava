package com.jmarkstar.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by jmarkstar on 27/07/2017.
 */
public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int m = in.nextInt();
        int n = in.nextInt();

        int applesOnHouse=0,orangesOnHouse=0;
        for(int apple_i=0; apple_i < m; apple_i++){
            int applePosition = in.nextInt()+a;
            if(applePosition>=s && applePosition<=t) applesOnHouse++;
        }
        for(int orange_i=0; orange_i < n; orange_i++){
            int orangePosition = in.nextInt()+b;
            if(orangePosition>=s && orangePosition<=t) orangesOnHouse++;
        }
        System.out.println(applesOnHouse);
        System.out.println(orangesOnHouse);
    }
}
