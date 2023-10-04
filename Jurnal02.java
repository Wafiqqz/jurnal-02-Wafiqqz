import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
	Scanner aly = new Scanner(System.in);

	int pPP = aly.nextInt();
	int lPP = aly.nextInt();
	int sP  = aly.nextInt();

	boolean hasil = sP <= pPP & sP <= lPP;

	System.out.println("Kotak dapat masuk ke dalam Persegi Panjang? "+hasil);

	}
}
