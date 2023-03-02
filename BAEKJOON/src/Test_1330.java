import java.util.Scanner;

public class Test_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int fir = sc.nextInt();
		int sec = sc.nextInt();

		if (fir > sec) {
			System.out.println('>');
		} else if (fir < sec) {
			System.out.println('<');
		} else {
			System.out.println("==");
		}
	}
}
