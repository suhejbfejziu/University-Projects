import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jepni temp. ne fahrenheit");
        double f = scanner.nextDouble();

        double c = (f - 32) * 5.0/9.0;

        System.out.println(f + "fahrenheit=" + c + "celcius");
    }
}