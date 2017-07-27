package com.jmarkstar.java.big_number;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by jmarkstar on 27/07/2017.
 */
public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        if(a.toString().length() <= 200
                && b.toString().length() <= 200
                && a.compareTo(BigInteger.ZERO) >= 0
                && b.compareTo(BigInteger.ZERO) >= 0){
            System.out.println(""+a.add(b));
            System.out.println(""+a.multiply(b));
        }
    }
}
