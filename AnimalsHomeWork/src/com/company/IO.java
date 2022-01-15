package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class IO {


    final static Scanner in = new Scanner(System.in);

    public static String getString(String message) {
        System.out.println(message);
        return in.next();
    }

    public static int getInteger(String message) {
        System.out.println(message);
        return in.nextInt();
    }
    public static boolean getBoolean(String message) {
        System.out.println(message);
        return in.nextBoolean();
    }

}
