package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다 때려박아서... 찜찜하지만
// 처음에 인덱스 옮기면서 더하고 지우면서 나가는 방법이 더 빠를 것 이라고 생각.
public class N2001_파리퇴치 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t < T + 1; t++) {
			System.out.print("#" + t + " ");
			String[] NM = br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			
			// 입력
			int[][] inputs = new int[N][N];
			for (int i = 0; i < N; i++) {
				String[] inputString = br.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					inputs[i][j] = Integer.parseInt(inputString[j]);
				}
			}
			
			int max = 0;
			// N - M + 1
			for (int i = 0; i < N - M + 1; i++) {
				for (int j = 0; j < N - M + 1; j++) {
					int value = 0;
					for (int k = i; k < i + M; k++) {
						for (int z = j; z < j + M; z++) {
							value += inputs[k][z];
						}
					}
					
					if (value > max) {
						max = value;
					}
				}
			}
			
			System.out.println(max);
		}
		br.close();
	}
}
