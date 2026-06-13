import java.util.Scanner;

public class RepasoClase {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String name;
        int age;
        float height;
        System.out.println("Please write your name: ");
        name = r.nextLine();
        System.out.println("Please write your age: ");
        age = r.nextInt();
        System.out.println("Write your height");
        height = r.nextFloat();

        System.out.println("Your name is "+name+"\n"+
        "Your age is: "+age+"\n"+
        "Your height is: "+height);
    }
}
