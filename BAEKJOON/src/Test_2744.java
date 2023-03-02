import java.util.Scanner;

public class Test_2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		char c = ' ';
		
		String str1 = sc.next();
		c = str1.charAt(0);
		
		for(i = 0; c > 'A' || c < 'z'; i++) {
			if(c < 'a') {
			 c = (c-'0')-35;
			}
		}
	
		
		System.out.println(c);
		
		
		
		
	}

}
