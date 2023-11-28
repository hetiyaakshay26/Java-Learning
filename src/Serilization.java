import java.io.*;
class Akshay implements Serializable{
    String name ="Akshay";
    int age = 22;
}
public class Serilization {
    public static void main(String[] args) throws Exception{
        Akshay a = new Akshay();

        // serilization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

        // deserilization
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Akshay a2 = (Akshay) ois.readObject();

        System.out.println(a2.name +" "+ a2.age);
    }
}
