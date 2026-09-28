public class TaskTwenty{
    public static void main(String[] args){

        double balance = 5000.00;
        double deposit = 1200.50;
        double withdraws = 750.25;

        double amount = balance + deposit;
        double actual = amount - withdraws;
        double interest = actual * 0.015;

        System.out.printf("%.2f %n", interest);



}}
