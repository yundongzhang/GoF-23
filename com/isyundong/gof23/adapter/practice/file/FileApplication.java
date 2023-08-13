package com.isyundong.gof23.adapter.practice.file;

import java.io.IOException;

public class FileApplication {

    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("C:\\Users\\Yundong.Zhang\\Downloads\\file.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "4");
            fileIO.setValue("day", "21");
            fileIO.writeToFile("C:\\Users\\Yundong.Zhang\\Downloads\\newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
