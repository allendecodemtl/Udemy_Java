package com.github.allendecodemtl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String fileName = "/Users/mopom/Desktop/syllabus.txt";

    public static void main(String[] args) {
        processDetails();

    }

    public static void processSyllabus() {
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

    public static void processDetails() {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            String cummu = "";
            int counter = 1;
            while (scanner.hasNext()) {
                String x = scanner.nextLine();

                if (counter == 3) {

                    List<String> list = new ArrayList<String>(Arrays.asList(cummu.split("\\|")));
                    System.out.println(cummu + "|" + (list.get(1).length() == 5 ? "00:" + list.get(1) : list.get(1)));
                    counter = 1;
                    cummu = "";
                }
                counter++;
                cummu += (x + "|");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
