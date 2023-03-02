import java.util.Scanner;
import java.math.BigInteger;

public class Test_1271 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger money = sc.nextBigInteger();
		BigInteger life = sc.nextBigInteger();

		System.out.println(money.divide(life));
		System.out.println(money.remainder(life));
	}
}
