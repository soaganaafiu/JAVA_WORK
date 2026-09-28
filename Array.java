
import java.util.Scanner;

public class Array{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);


    double sum = 0.0;

    int[] numberStored= new int[5];

        for(int count = 0; count <= 4; count++){

            System.out.print("Enter number " + (count + 1) + ": ");

            int number = input.nextInt();

            numberStored[count] = number;

        }

        for(int index = 0; index <= 4; index++){

            System.out.print(numberStored[index]);

            System.out.print("  ");
        }

        // 4  76  9   3  2
        int largest = numberStored[0];//4

        for(int count = 0; count < numberStored.length; count++){
         
            if(numberStored[count] > largest){

                largest = numberStored[count];
            
            }
            
        }

        System.out.println();
        System.out.println("Largest: " + largest);



        int smallest = numberStored[0];//4

        for(int count = 0; count < numberStored.length; count++){
         
            if(numberStored[count] < smallest){

                smallest = numberStored[count];
            
            }
            
        }
                System.out.println("Smallest: " + smallest);

    }

}

