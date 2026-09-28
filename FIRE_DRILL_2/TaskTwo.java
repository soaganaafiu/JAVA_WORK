import java.util.Scanner;

public class TaskTwo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        double Sum = 0;

        for(int index = 1; index <= 10; index++){

            System.out.print("Enter Score: ");
            int score = input.nextInt();          
            
            Sum = Sum + score;
            }
        System.out.println("Average: " Sum/10.0);
}}
