import java.util.Scanner;

public class PrimeOrNot {

    public static void checkPrime(int n){
        if(n == 2){
            System.out.println(n + " is a prime no");
            return;
        } else if (n == 1 || n==0) {
            System.out.println(n + " is not a prime no.");
            return;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println(n + " is not a prime number");
                return;
            }
        }
        System.out.println(n + " is a prime number");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is prime or not : ");
        int n = sc.nextInt();
        checkPrime(n);
    }
}
