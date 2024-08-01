import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_1213 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 1; i <= 10; i++) {
			// 테스트 케이스 입력
			int t = Integer.parseInt(br.readLine());
			
			// 찾을 문자열 입력
			String str = br.readLine();
			
			// 전체 문자열 입력
			String sentence = br.readLine();
			
			// 답
			System.out.println("#" + t + " " + bruteForce(str, sentence));
		}
	}
	
	static int bruteForce(String str, String sentence) {
		// 문자열 등장 횟수 초기화
		int cnt = 0;
		
		// 문자열 검사
		for(int i = 0; i <= sentence.length() - str.length(); i++) {
			
			// 임의 문자열 길이 변수 설정
			int j;
			
			// 찾고자 했던 문자열과 일치하는지 대조 비교
			for(j = 0; j < str.length(); j++) {
				
				// 글자가 다르다면 대조 중단
				if(sentence.charAt(i + j) != str.charAt(j)) {
					break;
				}
			}
			
			// 위 for문을 통과했고,
			// 찾고자 했던 문자열 길이와 일치한다면
			if(j == str.length())
				cnt++;
		}
		
		// 횟수 값 반환
		return cnt;
	}
}
