import java.util.Scanner;

    public class Swap{

        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter a number: ");
        int secondNumber = input.nextInt();

        System.out.printf("Before: %d%d%n", firstNumber, secondNumber);
        System.out.printf("After: %d%d%n", secondNumber, firstNumber);
        
}}
