import java.util.*;

public class Test_4101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int case1 = sc.nextInt();
			int case2 = sc.nextInt();
			
			if (case1 == 0 && case2 == 0) {
				break;
			} else
				System.out.println(case1 > case2 ? "Yes" : "No");
		}
	}
}
