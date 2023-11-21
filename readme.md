# Learning Java
## What is Java 
 Java is high level, object-oriented, class-based, programming language 
 Every thing in java is written insde class
 
 ### **Java was developed by Sun Microsystems in 1995**

 ***James Gosling** is the father of java*
 
**Basic java Code snippet**

```java
    public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
        }
```
**public static void main(String[] args)**  is the main function from where code execution starts

**System.out.println();** is used to print something on screen

### Rules for declearing variables 

* A variable name can consist of Capital letters A-Z, lowercase letters a-z digits 0-9,
  and two special characters such as _ underscore and $ dollar sign.
* The first character must not be a digit.
* Blank spaces cannot be used in variable names.
* Java keywords cannot be used as variable names.
* Variable names are case-sensitive.
* There is no limit on the length of a variable name but by convention, it should be between 4 and 15 chars.
* Variable names always should exist on the left-hand side of assignment operators.

### Datatypes
***Java is Statically typed language***
means we need to declare the data type of variable before using

There are two types of data in java
1. Primitive Datatype
    * int
    * byte
    * short
    * long
    * float
    * double
    * char
    * boolean
2. Derived Datatypes 
    * Array
    * string 

### Taking input 
 To take input we need scanner class, so we have to import the scanner class 
 ```java
//importing scanner class
 import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        // creating object of scanner class
        Scanner sc = new Scanner(System.in);
        
        // using the scanner class methods to take the input
        int n = sc.nextInt();
        float a = sc.nextFloat();
    }
}

 ```
 ***% Operator only works with floats and doubles***
 
### Strings 
 String is basically the group of characters, or it is the character array
 
***Strings Are immutable***

String is a class having many methods 

```java
import java.util.Scanner;

class Strings {
    Scanner sc= new Scanner(System.in);
    // creating strings 
    String str1 = "Akshay";
    String str2 = new String("Learning Java");

    //taking string input

    String s = sc.next();
    // next() will take input only up to space. i.e. it will not read whole line but only first word
    string s1 = sc.nextLine();
    // nextLine() will take whole line as input 
    

}
```

#### String Methods

```java

public class StrMethods {
    public static void main(String[] args) {
        String str = "Akshay Hetiya";

        // to get the length of the string
        int len = str.length();

        //to get the character at the given index 
        System.out.println(str.charAt(2));

        //to get the index of first occurance of character in the string 
        int index = str.indexOf('s');

    }
}
```