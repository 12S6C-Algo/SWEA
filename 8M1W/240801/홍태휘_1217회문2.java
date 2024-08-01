import java.util.Arrays;
import java.util.Scanner;

public class 회문2_1217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for ( int i = 1 ; i <= 10 ; i++) {
			int test_case = Integer.parseInt(sc.nextLine());
			
			// 2차원 배열을 만들고 채움
			char[][] palindrome = new char[100][100];
			
			for ( int j = 0 ; j < 100 ; j++) {
				String str = sc.nextLine();
				for ( int k = 0 ; k < 100 ; k++) {	
					palindrome[j][k] = str.charAt(k);
				}
			}
			int answer = 0;
			
			// 가로 방향 회문 확인
			for ( int lengthOfPal = 100 ; lengthOfPal > 0 ; lengthOfPal--) {
				for ( int row = 0 ; row < 100 ; row++) {
					for ( int start = 0 ; start <= 100 - lengthOfPal ; start++) {
						boolean isPalindrome = true;
						for ( int l = 0 ; l < lengthOfPal / 2 ; l++) {
							if(palindrome[row][start + l] != palindrome[row][start + lengthOfPal - l - 1]) {
								isPalindrome = false;
								break;
							}
						}
						if(isPalindrome) {
							answer = Math.max(answer, lengthOfPal);
							break; // 현재 길이에서 회문을 찾았으면 더 작은 길이로 갈 필요 없음
						}
					}
				}
			}
			
			// 세로 방향 회문 확인
			for ( int lengthOfPal = 100 ; lengthOfPal > 0 ; lengthOfPal--) {
				for ( int col = 0 ; col < 100 ; col++) {
					for ( int start = 0 ; start <= 100 - lengthOfPal ; start++) {
						boolean isPalindrome = true;
						for ( int l = 0 ; l < lengthOfPal / 2 ; l++) {
							if(palindrome[start + l][col] != palindrome[start + lengthOfPal - l - 1][col]) {
								isPalindrome = false;
								break;
							}
						}
						if(isPalindrome) {
							answer = Math.max(answer, lengthOfPal);
							break; // 현재 길이에서 회문을 찾았으면 더 작은 길이로 갈 필요 없음
						}
					}
				}
			}
			
			System.out.println("#" + test_case + " " + answer);
		}
		sc.close();
	}
}
