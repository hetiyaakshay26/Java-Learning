import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        String s = "akshay";
        StringBuffer sb = new StringBuffer(s);
        for(int i=0;i<sb.length();i++){
           char ch  = sb.charAt(i);
           if(ch=='a' || ch=='e'|| ch=='i' || ch == 'o' ||ch=='u'){
               sb.deleteCharAt(i);
           }
        }
        System.out.println(sb);
    }
}
