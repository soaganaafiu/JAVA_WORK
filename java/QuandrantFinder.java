import java.util.Scanner;
public class QuadrantFinder{
    public static void main(String[] args){
           Scanner input = new Scanner (System.in);

            System.out.print("Enter a number: ");
            int numberOne = input.nextInt();

            System.out.print("Enter another number: ");
            int numberTwo input.nextInt();

            if(numberOne > 0 $$ numberTwo > 0){
                System.out.print("Q1");
            }

            if(numberOne < 0 $$ numberTwo > 0){
                System.out.print("Q2");
            }


            if(numberOne < 0 $$ numberTwo < 0){
                System.out.print("Q3");
            }


            if(numberOne > 0 $$ numberTwo < 0){
                System.out.print("Q4");
            }


            if(numberOne == 0 $$ numberTwo == 0){
                System.out.print("Origin");
            }


            if(numberTwo == 0 $$ numberTwo == 0){
                System.out.print("X-axis");
            }


            if(numberOne == 0 $$ numberTwo != 0){
                System.out.print("Q1");
            }

    }
}
