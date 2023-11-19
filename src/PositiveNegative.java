import java.util.Scanner;
public class PositiveNegative {
    // check whether the no. s +ve or negative
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b=-52;
        int c=5;
        checkPositive(a);
        checkPositive(b);
        checkPositive(c);

        int input = sc.nextInt();
        checkPositive(input);

    }

    public static void checkPositive(int no){
        if(no>0){
            System.out.println(no+" is Positive number.");
        }
        else if(no<0){
            System.out.println(no+" is Negative number.");

        }
        else{
            System.out.println("You entered Zero");
        }
    }
}
