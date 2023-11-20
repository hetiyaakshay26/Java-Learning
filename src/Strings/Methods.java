package Strings;

import java.time.chrono.MinguoDate;

public class Methods {
    public static void main(String[] args) {
        String str = "Akshay Hetiya.";

        // string methods

        //length() this will give length of string
        System.out.println(str.length());

        // charAt() returns the character at the given index
        System.out.println(str.charAt(2));

        // indexOf() returns the index of first occurance of charater passed, in the string
        System.out.println(str.indexOf('a'));
    }
}
