import java.util.Scanner;
public class TaskEight{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextInt();

            double area = (3.14159 * (radius * 2));

            System.out.printf("%.2f", area);

}}
