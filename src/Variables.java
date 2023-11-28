public class Variables {

    int x ;
    static int y = 5;

    public static void main(String[] args) {
        Variables v = new Variables();
        System.out.println(v.x);
        System.out.println(v.y);
        System.out.println(Variables.y);
        System.out.println(y);
        int z;
    }
}
