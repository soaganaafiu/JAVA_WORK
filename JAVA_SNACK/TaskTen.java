import java.util.Scanner;
public class TaskTen{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            System.out.print("Enter your First Name: ");
            String firstName = input.nextLine();

            System.out.print("Enter your Last Name: ");
            String lastName = input.nextLine();   

            System.out.print("Enter your Age: ");
            int age = input.nextInt();  

            System.out.printf("First Name: %s%n", firstName);
            System.out.printf("Last Name: %s%n", lastName);
            System.out.printf("Age: %d%n", age);
}}
