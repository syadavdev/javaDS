package com.sandi.javaDS.string;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrintStringByMostFrequentlyCharacters {

    public static void main(String...args){
        String name = "sandeep";
        char[] namesArray = name.toCharArray();
        int sizeOfName = name.length();

        int[] charsByASCII = new int[124];

        int i = 0;
        while(i < sizeOfName) {
            charsByASCII[namesArray[i]]++;
            i++;
        }

        List<CharsWithIndex> charsWithIndices = new ArrayList<>();
        i = 0;
        while(i < 124) {
            if(charsByASCII[i] != 0)
                charsWithIndices.add(new CharsWithIndex((char)i, charsByASCII[i]));
            i++;
        }

        Collections.sort(charsWithIndices);

        for (CharsWithIndex charsWithIndex : charsWithIndices) {
            int num = charsWithIndex.index;
            while(num > 0) {
                System.out.print(charsWithIndex.ch);
                num--;
            }
        }
    }

}

class CharsWithIndex implements Comparable<CharsWithIndex> {

    Character ch;
    Integer index;

    public CharsWithIndex(Character ch, Integer index) {
        this.ch = ch;
        this.index = index;
    }

    @Override
    public int compareTo(CharsWithIndex o) {
        return Integer.compare(this.index, o.index);
    }
}