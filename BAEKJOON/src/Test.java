import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n]; //배열을 n개만큼 만든다
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			System.out.print(arr[i]);
		}
	
		}		
}