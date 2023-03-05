import java.util.*;
public class Test_25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); // 영수증에 적힌 총 금액
		int n = sc.nextInt(); // 물건의 개수
		int sum = 0; // 입력한 영수증 금액의 합
		
		for(int i = 0; i < n; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();		

			sum = sum+price*num;
		}
		System.out.println(sum==x ? "Yes":"No");
	}
}
