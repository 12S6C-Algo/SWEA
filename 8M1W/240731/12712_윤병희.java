package SWEA;

import java.io.*;

public class N12712_파리퇴치3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t < T + 1; t++) {
			System.out.print("#" + t + " ");
			
			String[] NM = br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			
			// 입력
			int[][] inputs = new int[N+(M-1)*2][N+(M-1)*2];
			for (int i = M - 1; i < N + (M - 1) ; i++) {
				String[] inputString = br.readLine().split(" ");
				for (int j = M - 1; j < N + (M - 1); j++) {
					inputs[i][j] = Integer.parseInt(inputString[j - M + 1]);
				}
			}
			
			int maxValue = 0;
			
			int[] drCross = {1, 1, -1, -1};
			int[] dcCross = {-1, 1, 1, -1};
			
			int[] drStraight = {1, 0, -1, 0};
			int[] dcStraight = {0, 1, 0, -1};
			
			for (int i = M - 1; i < N + (M - 1) ; i++) {
				for (int j = M - 1; j < N + (M - 1); j++) {
					int valueC = inputs[i][j];
					int valueS = inputs[i][j];
					for (int k = 1; k < M; k++) {
						for (int d = 0; d < 4; d++) {
							valueC += inputs[i + drCross[d] * k][j + dcCross[d] * k];
							valueS += inputs[i + drStraight[d] * k][j + dcStraight[d] * k];
						}
					}
					
					if (maxValue < valueC) {
						maxValue = valueC;
					} 
					
					if (maxValue < valueS) {
						maxValue = valueS;
					}
				}
			}
			
			System.out.println(maxValue);
		}
		br.close();
	}
}
