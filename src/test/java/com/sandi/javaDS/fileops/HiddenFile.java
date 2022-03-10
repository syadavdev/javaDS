package com.sandi.javaDS.fileops;

import java.io.File;
import java.io.FileFilter;

public class HiddenFile {

    public static void main(String...args){
        /*File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });*/

        File[] hiddenFiles = new File(".").listFiles(File::isHidden);

        for(File file : hiddenFiles){
            System.out.println(file.getName());
        }
    }

}
