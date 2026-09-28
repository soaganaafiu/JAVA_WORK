import java.util.Scanner;
public class TaskTwentysix{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How old are you: ");
        int age = input.nextInt();

        if (age <= 13){
            System.out.println("Child");
        }
        else if (age <= 17){
            System.out.println("Teenager");
        }
        else if (age <= 64){
            System.out.println("Adult");
        }
        else{
            System.out.println("Senior");
        }

}}
