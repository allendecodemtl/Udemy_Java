package com.github.allendecodemtl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName = "/Users/mopom/Desktop/syllabus.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            String cummu = "";
            while (scanner.hasNext()) {
                String x = scanner.nextLine();
                if (x.equals("+")) {
                    cummu = "";
                }
                cummu += (x + "|");
                List<String> list = new ArrayList<String>(Arrays.asList(cummu.split("\\|")));
                if (list.size() == 4) {
                    System.out.println(cummu + "|" + (list.get(3).length() == 5 ? "00:" + list.get(3) : list.get(3)));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
