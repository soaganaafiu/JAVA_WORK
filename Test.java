import java.util.Scanner;

public class Test{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberOne = input.nextInt();

        int reversed = 0;

        while(numberOne > 0){

            int digit = numberOne % 10;

            reversed = reversed * 10 + digit;

            numberOne = numberOne / 10;

        System.out.print(reversed);
    
        }



}}
