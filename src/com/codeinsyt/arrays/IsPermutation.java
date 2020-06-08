package com.codeinsyt.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class IsPermutation {

    public static String  sort(String string){
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }


    public static boolean run(String string1, String string2){

        int[] letters = new int[128];
        char[] s_array = string1.toCharArray();
        for(char letter: s_array){
            letters[letter]++;
        }

        System.out.println(letters);

        for(int i = 0; i < string2.length(); i++){
            int c = string2.charAt(i);
            char n = string2.charAt(i);
            letters[c]--;
            if(letters[c] < 0){
                System.out.println("False");
                return false;
            }
        }

        System.out.println("True");
        return true;

    }

//    public static void run(String string1, String string2){
//        if(string1.length() != string2.length()){
//            System.out.println("False");
//        }else{
//            if( sort(string1).equals(sort(string2))){
//                System.out.println("True");
//            }else{
//                System.out.println("False");
//            }
//        }
//    }



//    public static void run(String string1, String string2){
//
//
//
//        //pushing all string characters in hashmap
//        HashMap<Character, Integer> holder = new HashMap<>();
//        for(int i = 0; i < string1.length() -1; i++ ){
//                char val = string1.charAt(i);
//                int count = holder.containsKey(val) ? holder.get(val) : 0;
//                holder.put(val, count + 1);
//        }
//
//        for(int i = 0; i < string1.length() ; i++){
//            char val = string2.charAt(i);
//            if (holder.containsKey(val) ){
//                int count = holder.get(val);
//                if( count == 1){
//                    holder.remove(val);
//                }else{
//                    holder.put(val, count -1);
//                }
//            }
//        }
//
//        if(holder.size() == 0){
//            System.out.println("True");
//        }else{
//            System.out.println(holder);
//            System.out.println("False" + holder.size());
//        }
//
//    }

}
