// Creating the IOExcetionProbelm class to handle IOException
package com.bridgelabz.exception;

import java.io.*;

public class IOExceptionProblem {

    public static void main(String[] args) {
        String fileName = "data.txt";  // The file to be read

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            System.out.println("File contents:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());  // User-friendly message
        }
    }
}

//data.txt (The system cannot find the file specified)


