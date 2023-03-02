import java.util.Scanner;
import java.math.BigInteger;

public class Test_2338 {

	public static void main(String[] args) {
	
		//int a = 0, b = 0;
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
	}

}
