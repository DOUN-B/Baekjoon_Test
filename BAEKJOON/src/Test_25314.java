import java.util.Scanner;

public class Test_25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a;

		for (a = 4; a <= n; a = a + 4) {
			System.out.print("long ");
		}
		System.out.print("int");
	}
}
