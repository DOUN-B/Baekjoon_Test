import java.util.Scanner;

public class Test_2753 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println(1);
		}
		else if(year % 400 == 0 && year % 100 == 0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		System.out.println((year % 4 ==0 && year % 100 != 0)||(year % 400 == 0 && year % 100 == 0) ? 1 : 0);
	}

}
