import java.util.Scanner;
	public class Bmi{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("weightInPounds: ");
		int weightInPounds = input.nextInt();
d

		System.out.println("heightInInches: ");
		float heightInInches = input.nextFloat();

		
		System.out.print("BMI = " + weightInPounds * 703 / heightInInches * heightInInches);
	}
}
				