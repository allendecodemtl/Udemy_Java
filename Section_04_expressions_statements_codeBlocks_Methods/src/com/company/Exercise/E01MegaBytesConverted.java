package com.company.Exercise;

public class E01MegaBytesConverted {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // 1 MB = 1024 KB
        final int conversionNumber = 1024;
        int YY; // Calculated megabytes
        int ZZ; // Remaining kilobytes

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0) {
            YY = 0;
            ZZ = 0;
            System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + " KB");
        }else {
            YY = kiloBytes / conversionNumber;
            ZZ = kiloBytes % (YY * conversionNumber);
            System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + " KB");
        }
    }

}
