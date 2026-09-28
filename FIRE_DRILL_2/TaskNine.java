import java.util.Scanner;

public class TaskNine{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count = 0;            

        for(int index = 1; index <= 10; index++){

            System.out.print("Enter a number: ");
            int number = input.nextInt();


            if (number <= 100 && number >= 0){
                count = number + count;
}

}
        System.out.println("SUM of Valid Number: "count);
}}

