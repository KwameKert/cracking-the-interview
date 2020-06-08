package com.codeinsyt.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IsUnique {

//    public static boolean run(String string){
//        String sortedString = sortString(string);
//        for(int i =0; i< sortedString.length() -1; i++){
//            if(sortedString.charAt(i) == sortedString.charAt(i+1)){
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean run(String string){
        //character holder
        boolean[] char_set = new boolean[126];
        for(int i=0; i < string.length(); i++){
                char val = string.charAt(i);
            if(char_set[val]){
                System.out.println(val);
                return false;
            }else{
                char_set[val] = true;
            }
        }
        return true;
    }


//    public static String sortString(String string){
//        //convert string to array of characters
//        char tempArray[] = string.toCharArray();
//        //sort the array
//        Arrays.sort(tempArray);
//        return new String(tempArray);
//    }
}

