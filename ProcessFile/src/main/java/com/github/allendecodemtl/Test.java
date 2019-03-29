package com.github.allendecodemtl;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {

        System.out.println(Paths.get(".","src/main/resources/syllabus.txt").toAbsolutePath());
        System.out.println(FileSystems.getDefault().getPath(".","src/main/resources/syllabus.txt"));
    }
}
