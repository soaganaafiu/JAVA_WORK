import java.util.Scanner;

public class TaskFive{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int Sum = 0;

        for(int index = 1; index <= 10; index++){

            System.out.print("Enter Score: ");
            int score = input.nextInt();          
            if (score % 2 == 0){
                Sum = Sum + score;
                }
            }
        System.out.println("Sum: " + Sum);

}}

