import java.util.Scanner;
public class TaskFifteen{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            System.out.print("Distance in Miles: ");
            double distance = input.nextDouble();

            double kilometres = distance * 1.60934;

            System.out.println("Distance in Miles: " + distance);
            System.out.println("Distance in KIlometres: " + kilometres);
}}
