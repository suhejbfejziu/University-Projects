import java.util.Scanner;

public class getMinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jepni nje numer katershifror");
        int n = scanner.nextInt();

        int a = n/1000;
        n = n%1000;
        int b = n/100;
        n = n%100;
        int c = n/10;
        n = n%10;
        int d = n;

        n = a;
        if(b < n) {
            n = b;
        }
        else if(c < n){
            n = c;
        }
        else if(d < n){
            n = d;
        }
        System.out.println(n);
    }
}