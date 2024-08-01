import java.util.Scanner;

public class 초심자의회문검사_1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for ( int i = 1 ; i <= test_case ; i++) {
			String palindrome = sc.next();
			
			char[] charArr = palindrome.toCharArray();
			
			int answer = 1;
			for ( int j = 0 ; j < charArr.length/2; j++) {
				if ( charArr[j] == charArr[charArr.length-1-j]) {
					continue;
				}else {
					answer = 0;
				}
			}
			System.out.println("#"+i+" "+answer);
		}
	}
}
