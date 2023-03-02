import java.util.Scanner;

public class Test_2884 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();

		if (min < 45) {
			if (hour > 0) {
				System.out.printf("%d %d", hour - 1, min + 15);
			} else {
				System.out.printf("%d %d", hour + 23, min + 15);
			}
		}
//		else if (min == 45) {
//			System.out.printf("%d %s", hour, "00");
//		}
//		else {
//			System.out.printf("%d %d", hour, min-45);
//		}
		else if (min >= 45) {
			System.out.printf("%d %d", hour, min - 45);
		}

	}

}
