import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your name: ");
        int age = input.nextInt();

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + "years old");

}}
