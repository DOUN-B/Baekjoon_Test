import java.util.*;

public class Test_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9]; // arr배열 객체를 생성한다
		int i; // 배열의 자리를 표시하기 위한 변수

		for (i = 0; i < arr.length; i++) { // 배열 i번쨰 값이 배열의 길이보다 작을떄까지 i를 1씩 더한다
			arr[i] = sc.nextInt(); // 배열 arr의 i번째 자리에 값을 입력받는다
		}

		int max = arr[0]; // 배열 중 최대값을 구하기 위해 값을 배열 0번째로 초기화
		int tmp = 1; // 최대값의 자리수를 표현하기 위한 변수 초기화

		for (i = 1; i < arr.length; i++) { // 배열 i번쨰 값이 배열의 길이보다 작을떄까지 i를 1씩 더한다 : i가 1인 이유는 비교값인 max의 값을 배열 0번째로 지정해줬기
											// 떄문
			if (arr[i] > max) { // max값이 배열 arr i의 자리의 값보다 작으면
				max = arr[i]; // 배열 arr i의 값을 max에 대입한다
				tmp = i + 1;// 최대값의 자리수를 표시하기 위해 배열 자리수인 i에 1을 더하여 tmp에 값을 대입한다
			}
		}
		System.out.printf("%d%n%d", max, tmp);
	}
}
