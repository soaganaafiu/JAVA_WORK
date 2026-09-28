import java.util.Scanner;
public class TaskSix{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            System.out.print("Enter number: ");
            int numberOne = input.nextInt();

            System.out.print("Enter number: ");
            int numberTwo = input.nextInt();   



            System.out.println("Sum: " + (numberOne + numberTwo)); 
            System.out.println("Difference: " + (numberOne - numberTwo));  
            System.out.println("Product: " + (numberOne * numberTwo));
            System.out.println("Quotient: " + (numberOne/numberTwo));

}}
