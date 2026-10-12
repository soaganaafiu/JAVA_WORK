import java.util.Scanner;

    public class Kata{

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int numberOne = input.nextInt();

            System.out.print("Enter second number: ");
            int numberTwo = input.nextInt();





            int largestNumber = maximumNumber(numberOne, numberTwo);
            System.out.println("Largest number: " + largestNumber);


            boolean answer = isEven(numberOne);
            System.out.println("This is Even: " + answer);


            boolean primeCheck = primeNumber(numberOne);
            System.out.println("This is a Prime Number: " + primeCheck);


            int subtract = subraction(numberOne, numberTwo);
            System.out.println("This is the subtraction of two number: " + subtract);


            double divide = division(numberOne, numberTwo);
            System.out.println("This is division: " + divide);

            long factorial = factorialOf(numberOne);
            System.out.println("The factorial of number one is: " + factorial);

            int factor = factorOf(numberOne);
            System.out.println("The factor of number one is: " + factor);


            boolean square = isPerfectSquare(numberOne);
            System.out.println("Is this a perfect square: " + square);

            boolean palindrome = isPalindrome(numberOne);
            System.out.println("Is this a palindrome: " + palindrome );

         
}
    static int maximumNumber(int numberOne, int numberTwo){
        
        int largest = numberOne;

        if (numberTwo > largest){
            largest = numberTwo;

        }
        return largest;
    }



    static boolean isEven(int numberOne){

        if (numberOne % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }



    static boolean primeNumber(int numberOne){

        if(numberOne < 2){
            return false;
        }

        for (int count = 2; count < numberOne; count++){
            if (numberOne % count == 0)
                return false;

            }


                return true;

        }


    static int subraction(int numberOne, int numberTwo){
        if (numberOne > numberTwo){
            return numberOne - numberTwo;
        }
        return numberTwo - numberOne;
    }


    static double division(int numberOne, int numberTwo){
        if(numberTwo == 0){
            return 0.0;
        }
        return numberOne / numberTwo;

    }


    static long squareOf(int numberOne) {
        return numberOne * numberOne;
    }



    static long factorialOf(int numberOne){

        int multiply = 1;

        for(int count = 1; count <= numberOne; count++){

            multiply = multiply * count;

        }
        return multiply;
    }

    static int factorOf(int numberOne){

        int add = 0;

        for(int count = 1; count <= numberOne; count++){

            if(numberOne % count == 0){
        
                add++;

                }

        }
        return add;

    }


    static boolean isPerfectSquare(int numberOne){

         for(int count = 1; count <= numberOne; count++){

            if(count * count == numberOne){

                return true;
                
            }

        }
                return false;
    }


    static boolean isPalindrome(int numberOne){

        int reversed = 0;

        while(numberOne > 0){

            int digit = numberOne % 10;

            reversed = reversed * 10 + digit;

            numberOne = numberOne / 10;
    
        }

        if (reversed == numberOne){

            return true;

        }

        return false;

}
}







