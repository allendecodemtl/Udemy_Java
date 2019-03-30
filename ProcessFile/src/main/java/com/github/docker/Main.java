package com.github.docker;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {
    public static final String fileInputDir = Paths.get("./src/main/resources/docker/" ).toString();
    public static final String fileOutputDir = Paths.get("./src/main/resources/docker/output/").toString();

    public static void main(String[] args) {
        processAllCmdFiles();
    }

    public static void processCmdFiles(String iFile, String oFile) {

        try (Scanner scanner = new Scanner(new File(fileInputDir + "/" + iFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutputDir + "/" + oFile))) {

            while (scanner.hasNext()) {
                String x = scanner.nextLine();
                if (x.startsWith("docker")) {
                    bw.write("``` bash\n");
                    bw.write(x + "\n");
                    bw.write("```\n");
                } else {
                    bw.write(x + "\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processAllCmdFiles() {
        try {
            Files.list(Paths.get(fileInputDir))
                    .filter(Files::isRegularFile)
                    .forEach(s -> {
                        String fileName = new File(s.toString()).getName();
                        processCmdFiles(fileName, fileName.replace(" ", "_").replace(".txt",".md"));
                    });
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}

