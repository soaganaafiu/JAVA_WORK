import java.util.Scanner;

public class Favourite{
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
       		System.out.println("Guess a number: ");
	
        	int number = input.nextInt();


		if (number == (7)) {
			System.out.println("That's my favourite number!");
		}
		else { 
			System.out.println("Nice try, guess again!");
		}	
	}
}