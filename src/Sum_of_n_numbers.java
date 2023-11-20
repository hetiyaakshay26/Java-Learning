import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum_of_n_numbers {
    public static int sumOfN(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfN(n));

    }
}
