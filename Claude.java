import java.util.Scanner;

    public class Claude{

        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] examScore = new int [6];

        for(int count = 0; count <= 5; count++){

            System.out.print("Enter student score: ");
            int score = input.nextInt();

            examScore[count] = score;

        }
        
        for(int index = 0; index <= 5; index++){

            System.out.print(examScore[index]);
            System.out.print("  ");
    
        }











}}
