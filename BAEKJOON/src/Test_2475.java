import java.util.Scanner;

public class Test_2475 {

	public static void main(String[] args) {

		int n6 = 0;
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();

		n6 = ((n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4) + (n5 * n5)) % 10;
		System.out.println(n6);

	}

}
