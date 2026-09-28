import java.util.Scanner;
public class TaskFiftytwo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
        int number;
        int sum = 0;

            System.out.print("Enter a number and if you want to stop enter 0: ");
            number = input.nextInt();
        
        while(number != 0){

            sum = sum + number;

            System.out.print("Enter a number and if you want to stop enter 0: ");
            number = input.nextInt();

        }
        System.out.println(sum);
	}
}
