/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session09;

/**
 *
 * @author jeffs
 */
public class ArraySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int marks[];
        int numMarks = 5;
        int foundAt;
        int markWanted;
        int startPos = 0;

        // Declare marks array for testing
        marks = new int[numMarks];
        marks[0] = 133;
        marks[1] = 55;
        marks[2] = 44;
        marks[3] = 133;
        marks[4] = 133;

        // Test findValue found
        System.out.println("Test findValue found");
        markWanted = 44;
        foundAt = findValue(marks, markWanted);
        System.out.println("Mark " + markWanted + " found at index " + foundAt);

        // Test findValue not found
        System.out.println("\nTest findValue not found");
        markWanted = 33;
        foundAt = findValue(marks, markWanted);
        System.out.println("Mark " + markWanted + " found at index " + foundAt);

        // Test findValueNext found
        System.out.println("\nTest findValueNext found");
        markWanted = 133;
        startPos = 2;
        foundAt = findNextValue(marks, startPos, markWanted);
        System.out.println("Mark " + markWanted + " found at index " + foundAt);

        // Test findValueNext not found
        System.out.println("\nTest findValueNext found");
        markWanted = 44;
        startPos = 3;
        foundAt = findNextValue(marks, startPos, markWanted);
        System.out.println("Mark " + markWanted + " found at index " + foundAt);

        // Test findValueNext found
        System.out.println("\nTest findValueAll found");
        markWanted = 133;
        int[] foundAtArray = findValueAll(marks, markWanted);
        System.out.println(printFinalValueAllResult(foundAtArray, markWanted));

        // Test findValueAll not found
        System.out.println("\nTest findValueAll not found");
        markWanted = 2;
        foundAtArray = findValueAll(marks, markWanted);
        System.out.println(printFinalValueAllResult(foundAtArray, markWanted));

    }

    public static int findValue(int[] a, int target) {
        int i;

        i = 0;
        while (i < a.length && a[i] != target) {
            i++;
        }

        if (i < a.length) {
            return i;
        } else {
            return -1;
        }
    }

    public static int findNextValue(int[] a, int startPos, int target) {
        int i;
        int numElements;

        numElements = a.length;
        // Reset startPos if out of bounds
        if (startPos < 0 || startPos >= numElements) {
            startPos = 0;
        }

        // Set the index to start at startPos
        i = startPos;
        while (i < numElements && a[i] != target) {
            i++;
        }

        if (i < numElements) {
            return i;
        } else {
            return -1;
        }
    }

    public static int[] findValueAll(int[] inputArray, int target) {

        int valuesFoundAt[];
        int valuesFoundCount = 0;
        int elementCount;

        // Get the count of total items in array
        elementCount = inputArray.length;

        // Get the count of instances of target in array
        for (int i = 0; i < elementCount; i++) {
            if (inputArray[i] == target) {
                valuesFoundCount++;
            }
        }

        // Set size of valuesFoundAt array to count
        valuesFoundAt = new int[valuesFoundCount];

        // Reset valuesFoundCount to 0 to use as index for valuesFoundAt
        valuesFoundCount = 0;

        for (int i = 0; i < elementCount; i++) {
            if (inputArray[i] == target) {
                valuesFoundAt[valuesFoundCount] = i;
                valuesFoundCount++;
            }
        }
        return valuesFoundAt;
    }

    public static String printFinalValueAllResult(int[] inputArray, int target) {
        StringBuilder sb = new StringBuilder();
        sb.append("Found " + inputArray.length + " instances");
        sb.append(" of " + target + ".");

        if (inputArray.length > 0) {
            sb.append("\nTarget values found at: ");
            for (int i = 0; i < inputArray.length; i++) {
                sb.append("\n" + inputArray[i]);
            }
        }

        return sb.toString();
    }
}
