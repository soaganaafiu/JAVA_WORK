import java.util.Scanner;
public class NumberReverse{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter your second number: ");
	int secondNumber = input.nextInt();

	//System.out.printf("Before:  %d%n", firstNumber);
	//System.out.printf("Before: %d%n", secondNumber);
	
	
	//System.out.printf("After: %d%n", secondNumber);
	//System.out.printf("After:  %d%n", firstNumber);


	int firstNumber = firstNumber + secondNumber;
	int secondNumber = firstNumber - secondNumber;
	int firstNumber = firstNumber - secondNumber;


	System.out.print(firstNumber);
	System.out.print(numberTwo);

	}
}
	
	