import java.util.Scanner;

public class Test_11718 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 100; i++) {
			String str = sc.nextLine();
			
			if (str.length() > 100) {
				break;
			}
				System.out.println(str);
		}
	}
}