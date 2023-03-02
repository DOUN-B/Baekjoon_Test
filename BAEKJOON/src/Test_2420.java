import java.util.Scanner;

public class Test_2420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();
		long fam = 0;

		if (n < m) {
			while (n < m) {
				fam = fam + 1;
				n++;
			}
			System.out.println(fam);
		} else {
			while (m < n) {
				fam = fam + 1;
				m++;
			}
			System.out.println(fam);
		}
	}
}