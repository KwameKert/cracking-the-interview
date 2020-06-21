package com.codeinsyt.arrays;

public class StringCompression {


    public static  String run(String string){
        int final_count = getFinalLength(string);
        if (final_count > string.length()) return string;

        int counter = 0;
        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            counter++;

            if( i +1 >= string.length() || string.charAt(i) != string.charAt(i +1)){
                newString.append(string.charAt(i));
                newString.append(counter);
               counter = 0;
            }
        }

        return newString.toString();


    }


    public static int getFinalLength(String string){
        int counter = 0;
        int compressLength = 0;

        for(int i = 0; i < string.length(); i++){
            counter++;

            if( i +1 >= string.length() || string.charAt(i) != string.charAt(i +1)){
                compressLength += 1 + String.valueOf(compressLength).length();
                counter = 0;
            }
        }

        return compressLength;

    }
}
