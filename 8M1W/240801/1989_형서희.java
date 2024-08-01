import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        
		// 테스트 케이스 개수 입력
		int T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			// 단어 입력
			String str = sc.next();
			
			// 결과 기본값 1
			int result = 1;
			
			// 단어의 앞 절반과 뒷 절반 비교
			for(int j = 0; j < str.length() / 2 + 1; j++) {
				if(str.charAt(j) != str.charAt(str.length() - j - 1)) {
					result = 0;
					break;
				}
			}
			
			System.out.println("#" + i + " " + result);
			
		}
	}
}
