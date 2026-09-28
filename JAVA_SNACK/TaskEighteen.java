import java.util.Scanner;
public class TaskEighteen{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            System.out.print("Enter student score: ");
            double score = input.nextDouble();

            double scaledScore = score * 2;

            System.out.println("Score: " + score);
            System.out.println("Scaled Score: " + scaledScore);
}}
