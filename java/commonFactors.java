import java.util.Scanner;
public class commonFactors{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            for(int counter=1; counter <= number; counter++){

                if (number % counter == 0){
                    System.out.println(counter);
                }
            }
    }
}
