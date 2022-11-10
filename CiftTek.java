import java.util.Scanner;

public class CiftTek {
	public static void main(String [] args) {
		//INPUT
		Scanner input = new Scanner(System.in);
		System.out.print("jepni nje numer te plote: ");
		int n = input.nextInt();
		
		//PROCESIMI
		String r = (n % 2 == 0) ? "cift" : "tek";
		
		//OUTPUT
		System.out.println("numri eshte " + r);
	}
}