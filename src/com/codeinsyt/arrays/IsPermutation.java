package com.codeinsyt.arrays;

import java.util.HashMap;

public class IsPermutation {

    public static void run(String string1, String string2){

        //pushing all string characters in hashmap
        HashMap<Character, Integer> holder = new HashMap<>();
        for(int i = 0; i < string1.length() -1; i++ ){
                char val = string1.charAt(i);
                int count = holder.containsKey(val) ? holder.get(val) : 0;
                holder.put(val, count + 1);
        }

        for(int i = 0; i < string1.length() ; i++){
            char val = string2.charAt(i);
            if (holder.containsKey(val) ){
                int count = holder.get(val);
                if( count == 1){
                    holder.remove(val);
                }else{
                    holder.put(val, count -1);
                }
            }
        }

        if(holder.size() == 0){
            System.out.println("True");
        }else{
            System.out.println(holder);
            System.out.println("False" + holder.size());
        }

    }
}
