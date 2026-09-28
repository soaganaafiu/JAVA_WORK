import java.util.Scanner;
public class Division{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter first number: ");
		int num1 = input.nextInt();

		System.out.print("Enter second number: ");
		int num2 = input.nextInt();

		if(num2 != 0){
			System.out.print(num1/num2);
		}

		else if(num2 == 0){
			System.out.print("Cannot divide by zero");
		}
	}
}