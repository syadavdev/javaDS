package com.sandi.javaDS.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String...args){
        System.out.println(romanToInteger("CCCXXXIII"));
    }

    public static int romanToInteger(String s){
        int ans = 0, current = 0;
        Map<Character, Integer> map = new LinkedHashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = s.length()-1; i >= 0; i--) {
            current = map.get(s.charAt(i));
            if (4*current < ans)
                ans -= current;
            else
                ans += current;
        }

        return ans;
    }

}
