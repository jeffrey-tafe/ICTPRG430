package com.mycompany.session13;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Version 2 adds in a demo of using ObjectStreams (expanding on binary files)
 *
 * @author jeffs
 */
public class PlayWithFilesV2 {

    public static void main(String[] args) {

        try {
            objectOutputFile();
            objectInputFile();
            CSVOutputFile();
            CSVInputFile();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

    }

    public static void objectOutputFile() throws IOException {
        File myFile = new File("TestObjectOut.bin");
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(myFile));

        // Write one Person object
        Person p = new Person("BOB", "DOWN", 22);
        System.out.println("Person p written to object file = " + p);
        oos.writeObject(p);

        // Create an array of Person objects
        Person people[];
        people = new Person[1000];
        for (int i = 0; i < 1000; i++) {
            people[i] = new Person("FNAME" + i, "SNAME" + i, i);
        }

        // Write the whole people array to file
        oos.writeObject(people);

        oos.close();
    }

    public static void objectInputFile()
            throws IOException, ClassNotFoundException {

        System.out.println("objectInputFile Started");

        File myFile = new File("TestObjectOut.bin");
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(myFile));

        Person p;
        p = (Person) ois.readObject();
        System.out.println("Person p from object file = " + p);

        Person people[] = new Person[1000];
        people = (Person[]) ois.readObject();
        for (int i = 0; i < 1000; i++) {
            System.out.println("Peron " + i + " = " + people[i]);
        }
        ois.close();

    }

    public static void CSVOutputFile() throws IOException {
        File theFile = new File("CSVExample.csv");
        FileWriter outFileWriter = new FileWriter(theFile);
        PrintWriter out = new PrintWriter(outFileWriter);

        Person p = new Person("BOB", "DOWN", 22);

        StringBuilder sb = new StringBuilder();
        sb.append(p.getFirstName());
        sb.append(",");
        sb.append(p.getLastName());
        sb.append(",");
        sb.append(p.getAge());

        out.println(sb.toString());
        System.out.println("Person written to CSV file = " + p);
        out.close();
    }

    public static void CSVInputFile() throws IOException {
        FileReader inFileReader;
        BufferedReader in;
        String inStr;
        File myFile;
        String firstName;
        String lastName;
        int age;

        myFile = new File("CSVExample.csv");
        inFileReader = new FileReader(myFile);
        in = new BufferedReader(inFileReader);

        inStr = in.readLine();

        StringTokenizer personTok = new StringTokenizer(inStr, ",");
        firstName = personTok.nextToken();
        lastName = personTok.nextToken();
        age = new Integer(personTok.nextToken()).intValue();

        Person p = new Person(firstName, lastName, age);
        System.out.println("Person read from CSV file = " + p);

        in.close();
    }
}
