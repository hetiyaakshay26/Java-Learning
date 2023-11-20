import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b,c;
        a = sc.nextInt();
        b=sc.nextInt();
        c = sc.nextInt();
        CheckGreatest obj = new CheckGreatest();
        obj.check(a,b,c);
    }
}

class CheckGreatest{
    public void check(int a,int b,int c){
        if(a>b && a>c){
            System.out.println(a + " is greatest");
        }
        else if(b>a && b>c){
            System.out.println(b + " is greatest");

        }
        else{
            System.out.println(c + " is greatest");

        }
    }
}