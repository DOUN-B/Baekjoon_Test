import java.util.Scanner;
public class Test_5522 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score =0;
		for(int i = 0; i < 5; i++) {			
			score += sc.nextInt();
		}
		System.out.println(score);
	}
}
