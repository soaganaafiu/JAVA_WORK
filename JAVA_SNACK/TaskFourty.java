import java.util.Scanner;
public class TaskFourty{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter your income: ");
		int income = input.nextInt();

        if (income <= 300,000){
            System.out.print("0% Tax")
        }
        else if(income <= 600,000){
            System.out.print("7% Tax")
        }
        else if(income > 600,000){
            System.out.print("15% Tax")
        }
		
	}
}
