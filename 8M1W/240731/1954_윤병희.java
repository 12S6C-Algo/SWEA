package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1954_달팽이숫자 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCount = Integer.parseInt(br.readLine());
		int[] testCase = new int[testCount];
		for (int i = 0; i < testCount; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		for (int test = 0; test < testCount; test++) {
			System.out.println("#" + (test+1));
			int N = testCase[test];
			
			int[] dr = {0, 1, 0, -1};
			int[] dc = {1, 0, -1, 0};
			
			int[][] inputArrays = new int[N][N];
			int direction = 0;
			
			int row = 0;
			int colunm = 0;
			inputArrays[0][0] = 1;
			for (int num = 1; num <= N * N; num++) {
				inputArrays[row][colunm] = num;
				
				if (!((row + dr[direction] < N) && (0 <= row + dr[direction]) && (colunm + dc[direction] < N) && (0 <= colunm + dc[direction])))  {
					direction = changeDirection(direction);
				} else if (inputArrays[dr[direction]+row][dc[direction]+colunm] != 0) {
					direction = changeDirection(direction);
				}
				
				row += dr[direction];
				colunm += dc[direction];
			}
			
			for (int[] deep : inputArrays) {
				String d = "";
				for (int value : deep) {
					d += value + " ";
				}
				System.out.println(d);
			}
		}
	}

	static int changeDirection(int value) {
		switch (value) {
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 3;
		case 3:
			return 0;
		}
		
		return -0;
	}
}
