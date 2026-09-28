import java.util.Scanner;
	public class Fourth{
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a value1: ");
		int number1 = input.nextInt();
		int result1 = number1 * 3;
		

		System.out.println("Enter a value2: ");
		int number2 = input.nextInt();
		int result2 = number2 * 2;


		System.out.print(result1 % result2);
	}
}