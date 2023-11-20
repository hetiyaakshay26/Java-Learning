package Strings;

import java.util.Scanner;

public class Basics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // creating strings
        String s = "Akshay";
        System.out.println(s);

        String newString = new String("Learning Java");
        System.out.println(newString);
        // taking string input

        // next() method only takes single word as input not whole line
     //   String str = sc.next();
      //  System.out.println(str);
        // to take whole line as input  use nextLine() method


        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
