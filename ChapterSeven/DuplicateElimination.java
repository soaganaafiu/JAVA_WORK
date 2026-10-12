import java.util.Scanner;

public class DuplicateElimination{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        for(int count = 0; count < array.length; count++){

            System.out.print("Enter a number between 1 and 100: ");
            int number = input.nextInt();

            while(number < 10 || nummber > 100){

                System.out.print("Invalid. Enter a number between 10 and 100: ");

                number = input.nextInt();

            }
        }

        System.out.print(array);

    }

}
