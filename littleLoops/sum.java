import java.util.Scanner;

public class Number{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = input.nextInt();

                int count = 0;
                int add = 0;

                while(count < number){

                count++;

                add = add + count;
}
    System.out.println(add);
}
}
