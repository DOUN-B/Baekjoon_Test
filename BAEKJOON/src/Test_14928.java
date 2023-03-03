import java.util.Scanner;
import java.math.BigInteger;

public class Test_14928 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger n = sc.nextBigInteger();
		BigInteger m = new BigInteger("20000303");
		
		System.out.println(n.remainder(m));
	}
}
