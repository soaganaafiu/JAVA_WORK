import java.util.Scanner;
public class TaskThirteen{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            System.out.print("Enter Item Price: ");
            double price = input.nextDouble();

            System.out.print("Enter Quantity: ");
            double quantity = input.nextDouble();   

            double subtotal = price * quantity;
            double vat = subtotal * 0.20;
            double total = subtotal + vat;


            System.out.println("Total: " + total);
}}
