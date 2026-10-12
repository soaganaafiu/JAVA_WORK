import java.util.Scanner;

public class CountRepeated{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();


        int number = 0;

        for(int count = name.length() -1; count >= 0; count--){

            char reverse = name.charAt(count);

            System.out.print(reverse);

            if(reverse == count)
        }

    }
}
