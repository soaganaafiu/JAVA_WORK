import java.util.Scanner; 
public class DrivingCost{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance");
        double drivingDistance = input.nextDouble();

        System.out.print("Enter the price per gallon");
        double pricePerGallon = input.nextDouble();

        System.out.print("Enter miles per gallon");
        double milesPerGallon = input.nextDouble();

        double costOfTrip = pricePerGallon * (drivingDistance/milesPerGallon);

        System.out.print("The cost of the trip is" + costOfTrip);
        }
    }
}







}}
