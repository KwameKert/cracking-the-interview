package com.codeinsyt.arrays;

public class Urlify {

    public static String run(String s, int size){
        //remove white spaces
        s.strip();

        //convert string to array
        String[] s_array = s.split(" ");
        StringBuilder result = new StringBuilder(size);
        for(int i = 0 ; i < s_array.length; i++ ){
            result.append(s_array[i]);
            if(i < s_array.length -1){
                result.append("%20");
            }
        }

        return result.toString();
    }
}
