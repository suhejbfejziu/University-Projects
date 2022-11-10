import java.util.Scanner;

public class NumriPozitivNegativ {
	public static void main(String [] args) {
		//INPUT
		Scanner s = new Scanner(System.in);
		System.out.print("jepni nje numer te plote: ");
		int n = s.nextInt();
		
		//PROCESIMI
		String r = (n < 0) ? "negativ" : "pozitiv";
		
		//OUTPUT
		System.out.println("numri eshte " + r);
	}
}