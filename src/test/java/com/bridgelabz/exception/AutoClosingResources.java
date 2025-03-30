package com.bridgelabz.exception;
import java.io.*;

public class AutoClosingResources {

    public static void main(String[] args) {

        String fileName = "info.txt";

        // Try-with-resources for automatic resource closing
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Reading the first line
            String firstLine = br.readLine();

            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Error reading file.");
        }
    }
}

//info.txt (The system cannot find the file specified)
//Error reading file.
