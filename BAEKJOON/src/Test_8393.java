import java.util.Scanner;

public class Test_8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i;
		int sum = 0;

		for (i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
