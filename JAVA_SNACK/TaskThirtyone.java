import java.util.Scanner;
public class TaskThirtyone{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);


		System.out.print("Enter your charges: ");
		int unit = input.nextInt();

        if (unit <= 100){
            System.out.println("N50/unit");
        }
        else if (unit <= 300){
            System.out.println("N75/unit");
        }
        else if (unit > 300){
            System.out.println("N100/unit");
        }

		
	}
}
