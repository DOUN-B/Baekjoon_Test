import java.util.Scanner;

public class Test_25372 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int strNum = sc.nextInt();
		int i;
		sc.nextLine();

		for (i = 0; i < strNum; i++) {
			String pw = sc.nextLine();
			System.out.println(pw.length() > 5 && pw.length() < 10 ? "yes" : "no");
		}
	}
}
