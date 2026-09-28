import java.util.Scanner;
public class First{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();

		System.out.print("Enter second number: ");
		int number2 = input.nextInt();

		System.out.print("Enter third number: ");
		int number3 = input.nextInt();

		System.out.print("Enter fourth number: ");
		int number4 = input.nextInt();

		System.out.print("Enter fifth number: ");
		int number5 = input.nextInt();

		int highest = number1;
		int lowest = number1;

		if(number2 > highest)
			highest = number2;
		if(number3 > highest)
			highest = number3;
		if(number4 > highest)
			highest = number4;
		if(number5 > highest)
			highest = number5;

		if(number2 < lowest)
			lowest = number2;
		if(number3 < lowest)
			lowest = number3;
		if(number4 < lowest)
			lowest = number4;
		if(number5 < lowest)
			lowest = number5;

		System.out.println("Highest: " + highest);
		System.out.println("Lowest: " + lowest);
	}
}