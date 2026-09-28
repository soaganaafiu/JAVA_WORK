import java.util.Scanner;
public class Number {
    public static void main(String []args) {
   
   

        Scanner input = new Scanner(System.in);
        System.out.println("input first number: ");
        int num1 = input.nextInt();

        System.out.println("input second number: ");
        int num2 = input.nextInt();

        System.out.println("input third number: ");
        int num3 = input.nextInt();

        System.out.println("input fourth number: ");
        int num4 = input.nextInt();

        System.out.println("input fifth number: ");
        int num5 = input.nextInt();



        if(num1 >= 1 && num1 <= 30){
            for (int counter = 1; counter <= num1; counter++) {
  
            System.out.print("*");
		}
		System.out.println();
	}

        if(num2 >= 1 && num2 <= 30){
            for (int counter = 1; counter <= num2; counter++) {

            System.out.print("*");
		}
		System.out.println();
	}

        if(num3 >= 1 && num3 <= 30){
            for (int counter = 1; counter <= num3; counter++) {

            System.out.print("*");
		}
		System.out.println();
	}

        if(num4 >= 1 && num4 <= 30){
            for (int counter = 1; counter <= num4; counter++) {

            System.out.print("*");
		}
		System.out.println();
	}

        if(num5 >= 1 && num5 <= 30){
            for (int counter = 1; counter <= num5; counter++) {

            System.out.print("*");
		}
		System.out.println();
	}


   }

}