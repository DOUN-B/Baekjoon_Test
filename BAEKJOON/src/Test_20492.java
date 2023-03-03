import java.util.Scanner;

public class Test_20492 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();

		System.out.printf("%d %d", (money * 78) / 100, (int) ((money * 95.6) / 100));
	}
}
