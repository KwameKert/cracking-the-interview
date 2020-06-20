package com.codeinsyt.arrays;

public class PalindromePermutation {

    public static boolean run(String string){
        int[] table = frequencyCounter(string);
        return maxCount(table);

    }

    public static int getCharacterValue(Character c){
        int val = Character.getNumericValue(c);
        if( val >= Character.getNumericValue('a') && val <= Character.getNumericValue('z')){
            return val - Character.getNumericValue('a');
        }
        return -1;
    }


    public static int[] frequencyCounter(String string){
        int[] counter = new int[26];
        for(int i = 0; i < string.length(); i++){
            int val = getCharacterValue(string.charAt(i));
            if(val != -1){
                counter[val]++;
            }
        }
        return counter;
    }


    public static boolean maxCount(int[] table){
        int found = 1;
        for( int i=0; i< table.length; i++){
            if(table[i] %2 ==1){
                if(found > 1){
                    return false;
                }else{
                    found++;
                }
            }
        }

        return true;
    }
}
