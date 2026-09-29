public class CompaoundInterest{

    public static void main(String[] args){

    double principal = 1000.0;

    for(int rate = 5; rate <= 10; rate++){

        for(int year = 1; year <= 10; year++){

            principal = principal * (1 + rate / 100.0);
        }

        System.out.println("Amount: " + principal);

}



}}
