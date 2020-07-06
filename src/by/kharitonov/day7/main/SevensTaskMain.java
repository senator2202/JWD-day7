package by.kharitonov.day7.main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SevensTaskMain {
    public static void main(String[] args) {
        int choice = 0;
        int cycle=3;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n1 — английский \n" +
                    "2 — белорусский\n" +
                    "другая - русский\n");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                continue;
            }
            String country = "";
            String language = "";
            switch (choice) {
                case 1:
                    country = "US";
                    language = "EN";
                    break;
                case 2:
                    country = "BY";
                    language = "BE";
                    break;
            }
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("property.text",
                    current);
            String s1 = rb.getString("str1");
            System.out.println(s1);
            String s2 = rb.getString("str2");
            System.out.println(s2);
        } while (--cycle>0);
    }
}

