import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n]; // 배열을 n개만큼 만든다

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); // 배열 값을 입력받는다
		}
		int v = sc.nextInt(); // 찾으려고 하는 숫자를 입력받는다
		int num = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == v) {
				num++;
			}
		}
		System.out.println(num);
	}
}