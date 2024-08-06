package algomango;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 알파벳개수 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//알파벳 입력 받기 
		String S = br.readLine();
		//a-z횟수를 적을 배열 생성해주기 
		int[] AlphabetCount = new int[26];
		
		
		for(int i = 0; i < S.length();i++) {
			//charAt: 문자열 --> char 문자 형태로 변환
			int c = S.charAt(i);
			//문자 c가 a - z 범위 안에 있다면 
			if(c >= 'a' && c <= 'z') {
			//알파벳 카운트 값 누적해줌
				AlphabetCount[c-'a']++;
			}
		}
		//배열의 길이 값 안에서 반복됨 
		for(int i = 0; i < AlphabetCount.length;i++) {
			//알파벳 한개씩 숫자 넣어지고 26개까지 반복 후 끝 
			System.out.print(AlphabetCount[i]+" ");	
		}
	}
}
