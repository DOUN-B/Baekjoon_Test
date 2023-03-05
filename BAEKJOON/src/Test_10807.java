import java.util.*;

public class Test_10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int v = sc.nextInt();
		int num = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == v) {
				num++;
			}
		}
		System.out.println(num);
	}
}
		