import java.util.Scanner;

public class Test_9498 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int score = 0;
		char grade = 'F';
		
		score = sc.nextInt();

		if (90 <= score) {
			grade = 'A';
		} else if (80 <= score) {
			grade = 'B';
		} else if (70 <= score) {
			grade = 'C';
		} else if (60 <= score) {
			grade = 'D';
		} 
		System.out.println(grade);
	}
}