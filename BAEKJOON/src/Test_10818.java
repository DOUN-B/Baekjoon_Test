import java.util.*;

public class Test_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 입력받을 정수의 개수
		int[] arr = new int[n]; // 배열을 n개만큼 만든다

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] < min) {
				min = arr[j];
			} else if (arr[j] > max) {
				max = arr[j];
			}
		}
		System.out.println(min + " " + max);
	}
}
