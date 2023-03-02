import java.util.Scanner;

public class Test_11718 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("여러 줄의 문자열을 입력하세요. (입력이 끝나면 Ctrl + z를 눌러주세요)");

	        StringBuilder sb = new StringBuilder();
	        while (scanner.hasNextLine()) {
	            sb.append(scanner.nextLine());
	            sb.append(System.lineSeparator()); // 줄바꿈
	        }

	        String inputString = sb.toString();
	        System.out.println("입력받은 문자열은 다음과 같습니다. \n" + inputString);
	    }
	}



//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ddddddddcccccc");
//		
//		String str = sc.nextLine();
//		
//		StringBuilder sb = new StringBuilder();
//		
//		
		
//	}
//
//}
