package com.codeinsyt.arrays;

public class Urlify {

    public static int countSpaces(char[] s, int trueLength){
        int count = 0;
        for(int i = 0; i < trueLength; i++){
            if(s[i] == ' '){
                count ++;
            }
        }
        return count;
    }

    public static String run(String s, int trueLength){
        char[] str = s.toCharArray();
        //count spaces in string
        int spaceCount = countSpaces(str, trueLength);
        //get total index of new string;
        int index =  trueLength + spaceCount*2;
        System.out.println("Index: "+index);

        System.out.println("string before : "+s);
        if (trueLength < str.length) str[trueLength] = '\0';
        System.out.println("string after : "+str);

        for(int i = trueLength -1; i >=0; i --){
            if(str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index -3;
            }else{
                str[index - 1] = str[i];
                index --;
            }
        }

        return s.toString();

    }

//    public static String run(String s, int size){
//        //remove white spaces
//        s.strip();
//
//        //convert string to array
//        String[] s_array = s.split(" ");
//        StringBuilder result = new StringBuilder(size);
//        for(int i = 0 ; i < s_array.length; i++ ){
//            result.append(s_array[i]);
//            if(i < s_array.length -1){
//                result.append("%20");
//            }
//        }
//
//        return result.toString();
//    }
//

}
