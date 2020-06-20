package com.codeinsyt.arrays;

import static java.lang.Math.abs;

public class OneWay {

    public static boolean run(String string1, String string2){
        String firstString ;
        String secondString;
        int change = 0;
        //define counters
        int firstCounter = 0;
        int secondCounter = 0;
        //get largest
        if(string1.length() > string2.length()){
            firstString = string1;
            secondString = string2;
        }else{
            firstString = string2;
            secondString = string1;
        }


        //looping through string and comparing values
        while(firstCounter < firstString.length() && secondCounter < secondString.length()){

            if(firstString.charAt(firstCounter) != secondString.charAt(secondCounter)){
                change++;
                firstCounter++;
            }else{
                firstCounter++;
                secondCounter++;
            }
        }


        int difference = abs(firstString.length() - secondString.length());
        if(difference > 1){
            change++;
        }
        return change <= 1;
    }
}
