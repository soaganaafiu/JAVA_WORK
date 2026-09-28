import java.util.Scanner;
	public class Meter{
		public static void main(String[] args){



			Scanner input = new Scanner(System.in);
			System.out.print("Green, yellow or red: ");
			String color = input.nextLine();

			if (color.equals("Green")){
				System.out.println("Go");
			}

			if (color.equals("Yellow")){
				System.out.println("Ready");
			}

			if (color.equals ("Red")){
				System.out.println("Stop");
			}
			
			if(!color.equals "Green"){
				while () {
					System.out.print("Invalid: ");
				}
			
			
	}
}
