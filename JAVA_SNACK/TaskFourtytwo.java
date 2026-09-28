import java.util.Scanner;
public class TaskFourtytwo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter a number: ");
		int number = input.nextInt();

        if (number % 3 == 0 && number % 5 == 0){
            System.out.print(Divisible by 3 and 5);
        }
        if (number % 3 == 0 && number % 5 != 0){
            System.out.print(Divisible by 3);
        }
        if (number % 3 != 0 && number % 5 == 0){
            System.out.print(Divisible by 5);
        }
        else{
            System.out.print("Divisible by none");}
		
	}
}
