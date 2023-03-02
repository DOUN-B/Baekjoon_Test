import java.util.Scanner;

public class Test_2438 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();

		for (int y = 0; y < star; y++) {
			for (int x = 0; x <= y; x++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
