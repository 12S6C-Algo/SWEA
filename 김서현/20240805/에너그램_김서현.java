package algomango;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 에너그램만들기 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b = br.readLine();
		
		//a, b 넣기
		StringBuilder abuilder = new StringBuilder(a);
		StringBuilder bbuilder = new StringBuilder(b);
		
		//a 말고 abuilder길이 로 범위
		for(int i = 0; i < a.length(); i++) {
			for(int j = 0 ; j <b.length();j++) {
				char ac = abuilder.charAt(i);
				char bc = bbuilder.charAt(j);
				
				//ac와 bc에 같은 문자가 있다면 
				if(ac == bc) {
					abuilder.deleteCharAt(i);
					bbuilder.deleteCharAt(j);
					
				//그 값을 제거해주세요 
				//그리고 a와 b의 길이를 제거해주고 
					i--;
					j--;
					
					break; //루프 탈출
					}
				//a,b총길이를 프린트해서 보여주세요
				}
			}
		int total_length = abuilder.length() +bbuilder.length();
		System.out.println(total_length);
	
	}
}
