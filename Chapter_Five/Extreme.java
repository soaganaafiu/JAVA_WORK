import java.util.Scanner;

    public class Extreme{

        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int number = input.nextInt();

        System.out.print("Enter a number 1: ");
        int numbers = input.nextInt();


        int smallest = numbers;
        int largest = numbers;

        for (int count = 2; count <= number; count++){

            System.out.print("Enter a number " + count + ": ");
            numbers = input.nextInt();


            if(numbers > largest){
                largest = numbers;
            }

            if(numbers < smallest){
                smallest = numbers;
            }

        }

        int sum = smallest + largest;


        System.out.print("Smallest Number: " + smallest);
        System.out.print("Largest Number: " + largest);
        System.out.print("Sum: " + sum);






}}
