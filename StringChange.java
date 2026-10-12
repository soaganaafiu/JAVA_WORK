import java.util.Scanner;

public class StringChange{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();


        char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    
        int number = 0;

        String reverse = "";


        for(int count = name.length() -1; count >= 0; count--){

            reverse += name.charAt(count);
        
            for(int index = 0; index < vowel.length; index++){

                if(name.charAt(count) == vowel[index]){

                    number++;
                }
            }


        }

              System.out.println("Reversed word: " + reverse);
              System.out.println("Number of vowels: " + number);
    }
}
