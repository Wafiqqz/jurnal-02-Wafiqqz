import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
	Scanner lea = new Scanner(System.in);

	int nP = lea.nextInt();
	int aS = lea.nextInt();
	int aD = lea.nextInt();

	double nilaiAkhir = (0.25 * nP) + (0.35 * aS) + (0.40 * aD);

	System.out.println(nilaiAkhir);

	boolean kelulusan = nilaiAkhir >= 75;

	System.out.println("Lulus MK: "+nilaiAkhir);

	}
}
