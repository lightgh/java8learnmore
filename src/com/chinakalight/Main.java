package com.chinakalight;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Learning and Practicing Java 8 Concepts");
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File filePath) {
                return filePath.isHidden();
            }
        });

        File[] hiddenFiles1 = new File(".").listFiles(File::isHidden);

        Arrays.stream(hiddenFiles1).forEach(file ->{
            System.out.println(file.getAbsoluteFile().toString());
        });
    }
}