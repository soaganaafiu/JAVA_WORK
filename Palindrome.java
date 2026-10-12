import java.util.Scanner;

    public class Palindrome{

        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Palindrome: ");
        String word = input.nextLine();

        String reverse = "";


        for(int count = word.length() -1; count >= 0; count--){

            reverse = reverse + word.charAt(count);

        }

            if(word.equalsIgnoreCase(reverse)){

                System.out.println("This is a palindrome");
            }

            else{

                System.out.println("This is not a palindrome");

            }


}}
