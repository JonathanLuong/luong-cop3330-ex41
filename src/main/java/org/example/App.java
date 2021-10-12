package org.example;

/**
 *  UCF COP3330 Fall 2021 Assignment 41 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        // reads/writes in the file
        Scanner in = new Scanner (new File("exercise41_input.txt"));
        FileWriter out = new FileWriter("exercise41_output.txt");

        // creates array for names
        ArrayList<String> names = new ArrayList<String>();

        // while the file has another line then proceed
        while (in.hasNextLine()) {
            // reads in said line to array
            names.add(in.nextLine());
        }

        // sorts the array
        Collections.sort(names);

        out.write("Total of " + names.size() + " names\n");
        out.write("------------------------\n");


        // prints out the ordered names in out file
        for(String str : names) {
            out.write(str + "\n");
        }

        // closes the out file
        out.close();

    }
}
