package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        Divide(3, 0);

        for (Map.Entry<String, String> student : studentFiles.entrySet()) {
            System.out.println(student.getKey() + " receives a value of " + CheckFileExtension(student.getValue()));
        }

    }

    public static void Divide(int x, int y) {
        if(y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero! Please enter a non-zero number for y.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(x/y);
        }
    }


    public static int CheckFileExtension(String fileName) {
        int points = 0;
        if (fileName == null) {
            try {
                throw new Exception("File Name Extension must exist");
            } catch (Exception e) {
                e.printStackTrace();
            }
            points = -1;
        } else if (fileName.equals("")) {
            try {
                throw new Exception("File Name Extension must not be empty. Score of '-1' assigned to student with missing File Name Extension");
            } catch (Exception e) {
                e.printStackTrace();
            }
            points = -1;
        } else if (fileName.endsWith(".java")) {
                points = 1;
        }
        return points;
    }
}
