import java.util.Scanner;

public class Test_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 1;
		int m = 1;

		n = sc.nextInt();

		while (n <= 9) {
			while (m <= 9) {
				System.out.println(n + " * " + m + " = " + n * m);
				m++;
			}
			n++;
		}
	}

}
