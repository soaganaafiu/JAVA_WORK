
public class Combination {

    public static void main(String[] args) {

        long result = combination(5, 3);

        System.out.println(result);
    }

    static long factorial(int number) {

        long result = 1;

        for (int counter = 1; counter <= number; counter++) {

            result = result * counter;
        }

        return result;
    }

    static long combination(int numberOne, int numberTwo) {

        long numerator = factorial(numberOne);

        long denominator = factorial(numberTwo) * factorial(numberOne - numberTwo);

        long result = numerator / denominator;

        return result;
    }
}









































//public class Combination{
//
//    public static void main(String[] args){
//
//            double combination = factorial(5, 3);
//            System.out.println(combination);
//            
//
//
//}
//    static long factorial(int firstNumber, int secondNumber){
//
//        long factorial = 1;
//        long factorial_two = 1;
//        long factorial_combine = 1;
//       
//
//        for(int counter = 1; counter <= firstNumber; counter++){
//
//            factorial = factorial * counter;
//
//        }
//
//        for(int count = 1; count <= secondNumber; count++){
//    
//            factorial_two = factorial_two * count;
//        }
//
//        long submission = firstNumber - secondNumber;
//
//        for(int counts = 1; counts <= submission; counts++){
//            
//            factorial_combine = factorial_combine * counts; 
//        }
//
//        long calculation = (factorial / ((factorial_combine) * factorial_two));
//   
//        return calculation;    
//}
//}
