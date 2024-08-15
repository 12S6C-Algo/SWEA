package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_2346 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 풍선 인덱스 저장할 덱 생성
		Deque<int[]> balloon = new ArrayDeque<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 풍선 안에 숫자들 입력받을 배열 생성
		int[] note = new int[N];
		
		for(int i = 0; i < N; i++) {
			note[i] = Integer.parseInt(st.nextToken());
		}
		
		// 결과 저장 (1번 풍선은 항상 먼저 터뜨릴 거니까 그냥 써둠)
		StringBuilder sb = new StringBuilder();
		sb.append("1 ");
		
		// 터뜨린 풍선에서 나온 숫자 move 변수에 저장
		int move = note[0];
		
		// 첫 풍선 말고 나머지 풍선 전부 덱에 저장 (풍선 번호 + 쪽지 숫자)
		for(int i = 1; i < N; i++){
			balloon.add(new int[] {(i+1), note[i]});
		}
		
		// 모든 풍선 터질 때까지 반복
		while(!balloon.isEmpty()) {
			
			if (move > 0) { 
				for(int i = 1; i < move; i++) {
					balloon.add(balloon.poll());
				}
				
				int[] nextpop = balloon.poll();
				move = nextpop[1]; // 풍선 값 nextpop에 저장해서 다음 반복에 사용
				sb.append(nextpop[0]+" ");
			}

			else {
				for(int i = 1; i < - move; i++) {
					// addFirst : 덱 맨 앞에 넣음
					// pollLast : 덱 맨 뒤 값 뺌
					balloon.addFirst(balloon.pollLast());
				}
				
				int[] nextpop = balloon.pollLast();
				move = nextpop[1]; // 풍선 값 nextpop에 저장해서 다음 반복에 사용
				sb.append(nextpop[0]+" ");
			}
		}
				
		System.out.println(sb.toString());
		
	}
}
