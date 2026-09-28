import java.util.Scanner;
public class Second{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		if(number % 3 == 0){
			System.out.print("This is divisible");
		}
		else{
			System.out.println("This is not divisible");
		}
	}
}