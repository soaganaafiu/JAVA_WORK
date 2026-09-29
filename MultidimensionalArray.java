
import java.util.Scanner;

public class MultidimensionalArray{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);


        char[][] store = new char [3][3];

        for(int countOne = 0; countOne < 3; countOne++){

            System.out.print("Enter X or O: ");

            store[0][countOne] = input.next().charAt(0);

        }

        for(int countTwo = 0; countTwo < 3; countTwo++){

            System.out.print("Enter X or O: ");  

            store[1][countTwo] = input.next().charAt(0);


        }

        for(int countThree = 0; countThree < 3; countThree++){

            System.out.print("Enter X or O: ");

            store[2][countThree] = input.next().charAt(0);
        }




        for(int index = 0; index < 3; index++){

            System.out.print(store[0][index]);
            System.out.print("          ");

        }

        System.out.println();

        for(int index = 0; index < 3; index++){

            System.out.print(store[1][index]);
            System.out.print("          ");

        }

        System.out.println();

        for(int index = 0; index < 3; index++){

            System.out.print(store[2][index]);
            System.out.print("          ");

        }

    }
}


