import java.util.*;

public class Test_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cook = sc.nextInt();

		int cook2 = min + cook;

		if (cook2 > 59) {
			hour += (cook2 / 60);
			min = (cook2 % 60);
			if (hour > 23) {
				System.out.printf("%d %d", hour - 24, min);
			} else
				System.out.printf("%d %d", hour, min);
		} else
			System.out.printf("%d %d", hour, cook2);
	}
}
