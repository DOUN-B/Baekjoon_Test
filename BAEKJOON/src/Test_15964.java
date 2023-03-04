import java.util.*;
public class Test_15964 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if(a > 0 && a <= 100000 && b > 0 && b <= 100000) {
			System.out.println((a+b)*(a-b));
		}
	}
}
