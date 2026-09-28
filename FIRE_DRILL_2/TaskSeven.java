import java.util.Scanner;

public class TaskSeven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        double Sum = 0;
        double counter = 0;

        for(int index = 1; index <= 10; index++){

            System.out.print("Enter Score: ");


            double score = input.nextInt(); 


            if (score % 2 == 0){
                Sum = Sum + score;

                counter++;


                }
            }
         System.out.println("Sum: " + Sum);
         System.out.println("Average: " + Sum / counter);

}}

