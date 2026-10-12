public class PiCalculator {

public static void main(String[] args) {

    double pi = 0.0;
    int denominator = 1;
    int sign = 1;

    for (int count = 1; count <= 200000; count++) {

        pi = pi + (4.0 / denominator) * sign;

        denominator = denominator + 2;
        sign = sign * -1;

        System.out.println(count + "    " + pi);
    }
}

}

