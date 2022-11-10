import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jepni nje numer katershifror: ");
        int n = scanner.nextInt();
        int norg = n;

        int a = n/1000;
        n = n%1000;
        int b = n/100;
        n = n%100;
        int c = n/10;
        n = n%10;
        int d = n;

        if (a != b && b != c && c != d)
        {
            System.out.print(norg + " eshte numer zigzag");
        }
        else{
            System.out.print(norg + " nuk eshte numer zigzag");
        }

    }
}