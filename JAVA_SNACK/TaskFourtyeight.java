import java.util.Scanner;
public class TaskFourtyfive{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
        int number;

        do{
            System.out.print("Enter a number: ");
		    number = input.nextInt();
           
        }while(number < 0);
            System.out.println("Enter a positive number ");

	}
}
