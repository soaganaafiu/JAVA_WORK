import java.util.Scanner;
public class TaskTwentynine{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter Username: ");
		String username = input.nextLine();

		System.out.print("Enter Password: ");
		int password = input.nextInt();

        if ("admin".equals (username) && password == 1234){
            System.out.println("Access Granted");
        }

        else{
            System.out.println("Access Denied");
        }


		
	}
}
