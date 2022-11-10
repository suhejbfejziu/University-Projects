import java.util.Scanner;
public class NumriDisarium {
	public static void main(String [] args) {
		//INPUT
		Scanner sc = new Scanner(System.in);
		System.out.print("jepni nje numer te plote tre-shifror: ");
		int n = sc.nextInt();
		int n1 = n;
		
		//PROCESIMI
		//procesi i nxjerrjes se shifrave nga numri i dhene 3-shifror, deri kur n=0
		int sh3 = n % 10;
		n = n / 10; //n /= 10
		int sh2 = n % 10;
		n = n / 10;
		int sh1 = n % 10;
		n = n / 10; //n=0
		
		int shuma = (int)(sh1 + Math.pow(sh2, 2) + Math.pow(sh3, 3));
		
		String r = (n1 == shuma) ? "Disarium" : "jo-Disarium";
		
		//OUTPUT
		System.out.println("numri i dhene eshte " + r);
	}
}