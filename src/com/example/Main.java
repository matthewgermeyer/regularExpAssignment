package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String TOLLS = "It tolls for thee.";
    private static final String ALLOWED = "[a-e]";
    static private Pattern pattern;
    static private Matcher matcher;


    public static void main(String[] args) {
        String s = "a";
        pattern = Pattern.compile(ALLOWED);
        matcher = pattern.matcher(s);

        if (matcher.matches()) {
            System.out.println("SUCCESS: matched " + ALLOWED);
        } else {
            System.out.println("ERROR: did not match " + ALLOWED);
        }

        s = "\\s";
        pattern = Pattern.compile(ALLOWED);
        matcher = pattern.matcher(s);

        if (matcher.matches()) {
            System.out.println("SUCCESS: matched " + ALLOWED);
        } else {
            System.out.println("ERROR: did not match " + ALLOWED);
        }

        s = "*";
        pattern = Pattern.compile(ALLOWED);
        matcher = pattern.matcher(s);

        if (matcher.matches()) {
            System.out.println("SUCCESS: matched " + ALLOWED);
        } else {
            System.out.println("ERROR: did not match " + ALLOWED);
        }

        s = "Q";
        pattern = Pattern.compile(ALLOWED);
        matcher = pattern.matcher(s);

        if (matcher.matches()) {
            System.out.println("SUCCESS: matched " + ALLOWED);
        } else {
            System.out.println("ERROR: did not match " + ALLOWED);
        }

        s = "!";
        pattern = Pattern.compile(ALLOWED);
        matcher = pattern.matcher(s);

        if (matcher.matches()) {
            System.out.println("SUCCESS: matched " + ALLOWED);
        } else {
            System.out.println("ERROR: did not match " + ALLOWED);
        }





        // Match for z
         pattern = Pattern.compile("[z]");
         matcher = pattern.matcher(TOLLS);
        match();

        //One or many digit char?
        pattern = Pattern.compile("[/d+]");
        matcher = pattern.matcher(TOLLS);
        match();

        //Not rstln or whitespace
        pattern = Pattern.compile("[^rstln\\s]");
        matcher = pattern.matcher(TOLLS);
        match();

        // Spaces only
        pattern = Pattern.compile("[\\s]");
        matcher = pattern.matcher(TOLLS);
        match();

        //Match for t, h, e, r, or s.
        pattern = Pattern.compile("[thers]");
        matcher = pattern.matcher(TOLLS);
        match();
    }


    private static void match() {
        System.out.println("\nMatching...");
        boolean found = false;
        while (matcher.find()) {
            System.out.printf("Matched \"%s\" starting at %d and ending at %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
            found = true;
        }
        if (!found) {
            System.out.println("No match found.");
        }
    }
}
