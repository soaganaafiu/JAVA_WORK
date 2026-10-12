import java.util.Scanner;

public class CreditCardValidator{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Hello, kindly enter card details to verify: ");
        String cardNumber = input.nextLine();
  

        
//        System.out.println(additionOfEven("4388576018402626"));

}

    static int additionOfEven(String cardNumber) {


        int sum = 0;

        for(int index = cardNumber.length()-2; index >= 0; index = index - 2){

            int digit = cardNumber.charAt(index) - '0';

            int multiply = digit * 2;

            int oneDigit = getOneDigit(multiply);

            sum = sum + oneDigit;

        }

        return sum;


    }

    static int getOneDigit(int number){

        if(number < 10){

            return number;
        }

        int moreThan = number / 10;
        int single = number % 10;

        int answer = moreThan + single;


        return answer;

    }

    static int additionOfOdd(String cardNumber){

        int sum = 0;

        for(int index = cardNumber.length()-1; index >= 0; index = index - 2){

            int digit = cardNumber.charAt(index) - '0';             

            sum = sum + digit;

        }

        return sum;

    }

    static int isValid(String cardNumber){

        for(int index = 0; index < cardNumber.length(); index++){

            if(cardNumber.charAt(index) >= 13 && cardNumber.charAt(index) <= 16);


        }

        return ;

    }



}
