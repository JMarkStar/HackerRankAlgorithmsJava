package com.jmarkstar.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jmarkstar on 10/05/2017.
 */
public class JavaRegex {

    public static void main(String args []){
        String text = "";
        String pattern = "";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        if(m.find()){

        }else{
            System.out.println("No match");
        }
    }
}
