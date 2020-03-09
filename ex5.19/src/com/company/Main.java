/*Write a method that takes a vararg String array. Verify that you can
pass either a comma-separated list of Strings or a String[] into this method. */
package com.company;

public class Main {

    static void showStrings(String... args)
    {
        for(String s : args)
            System.out.print(s + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        showStrings("один ", "два ", "три ", "четыри ");
        showStrings(new String[]{"1", "2", "3", "4"});
    }
}
