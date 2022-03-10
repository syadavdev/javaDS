package com.sandi.javaDS.string;

public class ReverseAString {

    public static void main(String...args){
        String name = "Sandeep";

        char[] arry = name.toCharArray();

        int i = 0, j = arry.length - 1;

        while(i != j){
            char temp = arry[i];
            arry[i] = arry[j];
            arry[j] = temp;

            i++;
            j--;
        }

        for(char ch : arry)
            System.out.print(ch);

        int[] arryOne = {5, 1, 2, 1, 3, 4, 5, 2, 3};
        duplicateElement(arryOne);
    }

    public static void duplicateElement(int[] arry){
        for(int i = 0;i < arry.length; i++){
            int j = i + 1;
            for(; j < arry.length; j++){
                if(arry[i] == arry[j])
                    System.out.println("duplicate element : " + arry[i]);
            }
        }
    }

}
