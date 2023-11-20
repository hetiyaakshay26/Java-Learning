import java.util.Scanner;

public class SumInGivenRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        SumInRange s = new SumInRange();
        System.out.println( s.sum(a,b));
    }
}

 class SumInRange{

     public int sum(int a,int b){
         int s = 0;
         for(int i=a;i<=b;i++){
             s = s+i;
         }
         return s;
     }
}