import java.util.Scanner;

public class Test_27294 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int time = sc.nextInt();
		int alco = sc.nextInt();

		System.out.println(time > 11 && time <= 16 && alco == 0 ? 320 : 280);
	}
}
