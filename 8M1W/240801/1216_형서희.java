import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        
 		// 글자판 배열 생성
		char[][] board = new char[100][100];
		
		for(int i = 1; i <= 10; i++) {
			// 테스트 케이스 번호 입력
			int t = sc.nextInt();
			
			// 빈 문자열 정의
			String s = "";
				
			// 글자판 배열 입력
			for(int r = 0; r < 100; r++) {
				s = sc.next();
				for(int c = 0; c < 100; c++) {
					board[r][c] = s.charAt(c);
				}
			}
			
			// 회문 여부 체크
			boolean check;
			
			// 회문 최대 길이 초기화
			int answer = 0;
			
			// 회문 길이 len에 따른 검사 
			for(int len = 0; len <= 100; len++) {

				// 가로줄 회문 검사
				for(int r = 0; r < 100; r++) {
					for(int c = 0; c <= 100 - len; c++) {
						
						// 회문 여부 기본값 설정
						check = true;
						
						// 회문 검사 후 회문 여부 수정
						for(int n = 0; n < len / 2; n++) {
							if(board[r][c + n] != board[r][c + len - n - 1]) {
								check = false;
								break;
							}				
						}
						
						// 회문이 맞고, 기존 회문 길이보다 길 시 새로운 회문대장 등극
						if(check && answer < len)
							answer = len;
					}		
				}
				
				// 세로줄 회문 검사
				for(int c = 0; c < 100; c++) {
					for(int r = 0; r <= 100 - len; r++) {
						
						// 회문 여부 기본값 설정
						check = true;
						
						// 회문 검사 후 회문 여부 수정
						for(int n = 0; n < len / 2; n++) {
							if(board[r + n][c] != board[r + len - n - 1][c]) {
								check = false;
								break;
							}
						}
						
						// 회문이 맞고, 기존 회문 길이보다 길 시 새로운 회문대장 등극
						if(check && answer < len)
							answer = len;
					}						
				}

			}
			
			// 답
			System.out.println("#" + t + " " + answer);
		}
	}
}
