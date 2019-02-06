package com.github.allendecodemtl.L_02_Map;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("================================================");

//        System.out.println(languages.remove("Lisp2"));
//        System.out.println(languages.remove("Lisp"));
//        System.out.println(languages.remove("Algol", "an language"));
//        System.out.println(languages.remove("Algol", "an algorithmic language"));

        System.out.println("================================================");

        System.out.println(languages.replace("Lisp", "test", "Test"));
        System.out.println(languages.replace("Lisp", "Therein lies madness", "Test"));

        System.out.println("================================================");


        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
