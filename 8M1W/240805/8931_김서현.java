package swea;

import java.util.Scanner;
import java.util.Stack;

public class 제로8931월요일 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 입력받기 
		int T = sc.nextInt(); 
		
		for( int tc = 1 ; tc <= T ; tc++ ) {
			//정수 K입력받기 
			int K = sc.nextInt();
			//스택 생성
			Stack <Integer> s = new Stack<>(); //스택 생성 함수 다시 보자 
			
			for(int i = 0 ; i < K ; i++) {
				//정수 K만큼 한줄에 정수 a 입력받기 
				int a = sc.nextInt();
				if(a == 0) {
					s.pop();
				}
				else {
					s.push(a);
				}
			}
			
			
			int Sum = 0;
			//s스택이 비어있지 않다면
			while(!s.isEmpty()) {
				//가장 위에 것을 꺼내고 
				int a = s.pop();   //<==== 이부분 틀렸음
				//a 값은 가장 최근의 것을 pop한 것이고 그 꺼낸 값을 
				//sum에 더한다
				Sum += a;
			}
			
		
		System.out.println("#"+ tc + " "+ Sum);
		
		}//for문 끝
	}
}
