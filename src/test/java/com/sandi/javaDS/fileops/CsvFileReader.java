package com.sandi.javaDS.fileops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvFileReader {

    public static void main(String...args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/Users/sandi/Documents/sandeep-github/micro-svcs/javaDS/src/main/java/com/sandi/javaDS/fileops/skupricelist.csv"));
        sc.useDelimiter(",");
        while(sc.hasNext()){
            System.out.print(sc.next());
        }
    }

}
