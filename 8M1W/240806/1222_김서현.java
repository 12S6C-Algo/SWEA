package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class 계산기1222다시1 {
	//버퍼드 리더에 throws Exception 
	public static void main(String[] args) throws Exception {
		//'new' ISR 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//문자열을 효율적으로 조작하기 위한 StringBuilder 사용
		StringBuilder sb = new StringBuilder();
		//연산자와 피연산자 스택 생성
		//Character 대문자 
		Stack <Character> stc = new Stack<>();
		Stack <Integer> sti = new Stack<>();
		

		//테스트 케이스 범위 생성 
		for(int tc = 1; tc <= 10; tc++) {
			//문자열의 길이 입력받기 
			int len = Integer.parseInt(br.readLine());
			//문자열 계산식 input으로 입력받기 
			String input = br.readLine();
			//스트링 빌더 값 초기화
			sb.setLength(0);
			
			//문자열길이만큼 i  값 범위 설정
			for(int i = 0 ; i < len; i++) {
				//currentchar 을 입력받은 input으로부터 가져오기 
				char CurrentChar = input.charAt(i);
				//currentchar이 숫자(피연산자)라면 
				if( '0' <= CurrentChar && CurrentChar <= '9' ) {
					//스트링 빌더에 currentchar 값을 넣는다
					sb.append(CurrentChar);
				}else { //currentchar이 연산자라면 
					//연산자 스택이 비어있지 않다면
					while(!stc.isEmpty()) {
						//스트링 빌더에 연산자에서 꺼내온 것을 더하고 
						sb.append(stc.pop());
					}
					//연산자 스택이 비어있다면 
					//currentchar에 값을 push넣어라 
					stc.push(CurrentChar);
				}	
			}
			//연산자 스택이 비어있지 않다면 
			while(!stc.empty()) {
			//계속해서 연산자 스택에서 꺼낸 것을 스트링 빌더에 추가하라 		
				sb.append(stc.pop());
			}
			
			//후위 표기식 계산
			//i가 스트링 빌더 길이 만큼의 범위를 갖는다 
			for( int i = 0; i < sb.length(); i++) {
				//스트링 빌더에서 값을 currentchar로 가져온다 
				char CurrentChar = sb.charAt(i);
				//currentchar이 숫자(연산자)라면 
				if('0'<=CurrentChar && CurrentChar <= '9') {
					//피연산자 스택에 숫자를 넣는다 
					sti.push(CurrentChar-'0');
				}else { //currentchar이 피연산자 라면
					//스택 위에의 숫자부터(num2) 빼서 
					int num2 = sti.pop();
					int num1 = sti.pop();
					//+계산을 해준다 ( 이 문제는 + 밖에 없음)
					//두개씩 빼서 계산한값을 다시 스택에 넣고 그 다음 숫자랑 다시 덧셈 반복
					//마지막 값이 총 계산을 끝낸 결과값이다 
					//먼저 넣어진 수(num1)부터 + 더하기 
					sti.push(num1+num2);
				}	
			}
			
			//피연산자 스택에서 총 계산하고 남은 값(결과 값)을 print한다 
			System.out.println("#" + tc + " "+ sti.pop());
		}
	}
}



