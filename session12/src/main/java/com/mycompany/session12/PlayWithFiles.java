/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session12;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author jeffs
 */
public class PlayWithFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            textOutputFile();
            textInputFile1();
            textInputFile2();
            binaryOutputFile();
            binaryInputFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void textOutputFile() throws IOException {
        File theFile = new File("TestTextFile.txt");
        FileWriter outFileWriter = new FileWriter(theFile);

        // You can open a file to append text by using the FileWriter constructor
        // that allows a second parameter indicating that you want to append.
        // Otherwise a new file is created each time.
        // FileWriter outFileWriter = new FileWriter(theFile, true);
        PrintWriter out = new PrintWriter(outFileWriter);

        out.println(12345);
        out.println("Hello");
        out.println(123.5);
        out.println(false);

        out.close();
    }

    /**
     * This method demonstrated using the to read lines in a text file. It
     * assumes the file is created with the method textOutputFile.
     *
     * @throws java.io.IOException
     */
    public static void textInputFile1() throws IOException {
        BufferedReader in;
        String inStr;
        int anInt;
        double aDouble;
        boolean aBoolean;

        System.out.println("===== EXAMPLE OF READING USING BUFFEREDREADER CLASS =======");
        in = new BufferedReader(new FileReader(new File("TestTextFile.txt")));

        inStr = in.readLine();
        anInt = Integer.parseInt(inStr);
        System.out.println(anInt);

        inStr = in.readLine();
        System.out.println(inStr);

        inStr = in.readLine();
        aDouble = Double.parseDouble(inStr);
        System.out.println(aDouble);

        inStr = in.readLine();
        aBoolean = Boolean.parseBoolean(inStr);
        System.out.println(aBoolean);

        in.close();
    }

    public static void textInputFile2() throws IOException {
        FileReader inFileReader;
        Scanner in;
        inFileReader = new FileReader("TestTextFile.txt");
        in = new Scanner(inFileReader);
        String inStr;
        int anInt;
        double aDouble;
        boolean aBoolean;

        System.out.println("=== EXAMPLE OF READING USING SCANNER CLASS ===");

        anInt = in.nextInt();
        System.out.println(anInt);

        inStr = in.next();
        System.out.println(inStr);

        aDouble = in.nextDouble();
        System.out.println(aDouble);

        aBoolean = in.nextBoolean();
        System.out.println(aBoolean);

        in.close();
    }

    public static void binaryOutputFile() throws IOException {
        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("TestBinaryFile.bin"));

        // Add a person object instance variables to the file
        Person p = new Person("BOB", "DOWN", 22);

        dos.writeUTF(p.getFirstName());
        dos.writeUTF(p.getLastName());
        dos.writeInt(p.getAge());

        // Add some variables to the file
        // Write how many ins wil follow, then write the ins
        dos.writeInt(5);;
        for (int i = 1; i <= 5; i++) {
            dos.writeInt(i);
        }
        dos.close();

    }

    public static void binaryInputFile() throws IOException {
        DataInputStream dis = new DataInputStream(
                new FileInputStream("TestBinaryFile.bin"));
        int items;
        int n;

        Person p = new Person();

        p.setFirstName(dis.readUTF());
        p.setLastName(dis.readUTF());
        p.setAge(dis.readInt());

        System.out.println("Person p from file = " + p);

        // read how many integers will follow then read the integers
        items = dis.readInt();
        for (int i = 1; i <= items; i++) {
            n = dis.readInt();
            System.out.print(n + " ");
        }
        System.out.println();
        dis.close();
    }
}
