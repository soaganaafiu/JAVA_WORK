import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.print("How old are you: ");
		int age = input.nextInt();

		
		if(age < 5 ){
			System.out.print("Free");
		}

		else if(age < 12){
			System.out.print("$5");
		}

		else if(age < 64){
			System.out.print("$12");
		}

		else{
			System.out.print("$8");
		}

		
	}
}