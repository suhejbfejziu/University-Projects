import java.util.Scanner;

public class secondstohours {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("Shkruaj sekondat: ");
        int sekondat = s.nextInt();

        sekondat = sekondat / 3600;

        System.out.println(sekondat + " Ore");
    }
}