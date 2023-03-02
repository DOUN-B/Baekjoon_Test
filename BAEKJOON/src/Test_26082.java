import java.util.Scanner;

public class Test_26082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int bPri = sc.nextInt();
		int bPerfo = sc.nextInt();
		int aPri = sc.nextInt();

		if (bPerfo % bPri == 0) {
			System.out.println(((bPerfo / bPri) * 3) * aPri);
		}
	}
}
