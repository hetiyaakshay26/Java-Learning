import java.util.Scanner;

public class EvenOrOdd {
    public static void checkEvenOdd(int n){
        if(n%2==0){
            System.out.println(n+" is Even number.");
        }
        else{
            System.out.println(n+" is Odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check whether it is even or odd : ");
        int n = sc.nextInt();
        checkEvenOdd(n);
    }
}
