package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 암호생성기1225 { // br--------->st --> q --> sb 로 옮겨서 푸는 구조
	public static void main(String[] args) throws Exception {
		// br 버퍼드 리더 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// st 하나씩 분리해서 받을 수 있는 스트링 토커나이저 생성
		StringTokenizer st;
		// sb 스트링빌더 생성
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());
			// 정수형 큐 생성
			Queue<Integer> q = new LinkedList<Integer>();
			// br ---> st 옮겨받음
			st = new StringTokenizer(br.readLine());
			// sb에 출력할 형태 더하기
			sb.append("#" + T + " ");

			// 8개의 정수값들을 q에 더해줌
			for (int i = 0; i < 8; i++) {
				q.add(Integer.parseInt(st.nextToken()));
			} // for문 여기서 닫아줌

			int count = 1;
			while (true) {
				// 반복되는 것 q에서 빼온 값이 1씩 줄어든다
				int tmp = q.poll();
				tmp -= count;
				// 만약 tmp가 0이거나 음수라면
				if (tmp <= 0) {
					// q에 0을 넣고 멈춘다
					q.offer(0);
					break;
				}
				// 양수라면~~
				// tmp의 값을 q에 넣는다
				// 5번 계산이 한 루트인데 5보다 크면 다시 1번더해주는 것으로 돌아가고
				// 5보다 작다면 더해주는 값(count)를 1씩 올린다 ~~
				q.offer(tmp);
				count = count + 1 > 5 ? 1 : count + 1;
			}

			for (int i = 0; i < 8; i++) {
				// 만약 8개의 값을 받았다면 그 값들 + 한줄을 띄워준다
				if (i == 7) {
					sb.append(q.poll() + "\n");
					// 아직 8개를 다 쓰지 못했다면 q에서 빼온 값들을 공백으로 구분해주면서 값을 sb에 넣어준다
				} else {
					sb.append(q.poll() + " ");
				}
			}
			// 그렇게 만들어진 sb배열을 출력한다

		}
		System.out.println(sb.toString());
	}
}
