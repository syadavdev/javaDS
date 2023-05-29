package com.sandi.javaDS.string;

public class CommonSubString {

    public static void main(String...args){

        String[] strs = {"flower","flow","flight"};
        System.out.println(commonAmongStrings(strs));
        //System.out.println("sandeep".substring(0,7));

    }

    public static String commonAmongStrings(String[] strs){
        String common = "";
        if(strs.length == 0)
            return common;
        if(strs.length == 1)
            return strs[0];

        String s1 = strs[0];
        String s2 = strs[1];
        for(int j = 0; j < (s1.length()+1) && j < (s2.length()+1); j++){
            if(s2.substring(0, j).equals(s1.substring(0, j))){
                common = s1.substring(0, j);
            }else{
                break;
            }
        }

        if(common.isEmpty())
            return common;

        for(int i = 2; i < strs.length;i++){
            for(int k = common.length(); k >= 0; k--){
                if(strs[i].substring(0, k).equals(common)){
                    break;
                }else{
                    common = common.substring(0, k-1);
                }
            }
        }

        return common;
    }

}
