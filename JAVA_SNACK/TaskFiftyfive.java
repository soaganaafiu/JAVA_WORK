import java.util.Scanner;
public class TaskFiftyfive{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 12");
        int number = input.nextInt();


        for(int index = 1; index <= 12; index++){
    
        int multiplication = number * index;

        System.out.println(multiplication);

}


}}
