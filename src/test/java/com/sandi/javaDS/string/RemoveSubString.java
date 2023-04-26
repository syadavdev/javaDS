package com.sandi.javaDS.string;

public class RemoveSubString {

    public static void main(String...args){

        String str = "my name is sandeep yadav and sandeep is very funny";
        String remove = "sandeep";

        char[] arry = str.toCharArray();
        char[] removeArry = remove.toCharArray();
        int end = 0;

        for(int i = 0;i < arry.length; i++){

            int j = 0;

            if(arry[i] == removeArry[j]) {
                for (; j < removeArry.length; j++) {
                    if (arry[i] == removeArry[j])
                        i++;
                    else
                        break;
                }
                end = i;
                if(j == removeArry.length){
                    for(;j > 0; j--, end--){
                        arry[end - 1] = Character.MIN_VALUE;
                    }
                }
            }

        }

        for(char ch : arry){
            if(ch != Character.MIN_VALUE)
                System.out.print(ch);
        }

        removeString(str, remove);
    }


    public static void removeString(String str, String word){

        int i = 0, temp = 0, j = 0, k = 0;
        int strLen = str.length();
        int wordLen = word.length();

        char[] strChars = new char[strLen];
        char[] wordChars = new char[wordLen];

        strChars = str.toCharArray();
        wordChars = word.toCharArray();
        for(i=0; i<strLen; i++)
        {
            temp = i;
            for(j=0; j<wordLen; j++)
            {
                if(strChars[i]==wordChars[j])
                    i++;
            }
            k = i-temp;
            if(k==wordLen)
            {
                for(j=temp; j<(strLen-wordLen); j++)
                    strChars[j] = strChars[j+wordLen];
                strLen = strLen-wordLen;
            }
        }

        System.out.print("\nThe new string is: ");
        for(i=0; i<strLen; i++)
            System.out.print(strChars[i]);

    }

}
