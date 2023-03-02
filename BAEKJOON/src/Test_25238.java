import java.util.Scanner;

public class Test_25238 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int shield = sc.nextInt();
		int shieldIg = sc.nextInt();

		System.out.println(((shield * (100 - shieldIg)) / 100) < 100 ? 1 : 0);
	}
}