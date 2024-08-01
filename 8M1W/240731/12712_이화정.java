package 실습_240731;

import java.util.*;
import java.io.*;

public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr = new int[N][N];
			
			for (int i = 0; i<N; i++) {
				for (int j = 0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			
            // + 방향으로 분사
			for(int i = 0; i<=N; i++) {
				for(int j = 0; j<=N; j++) {
					int	plus = 0;
						if (isInBounds(i,j,N))
							plus += arr[i][j];
						
						for (int k = 1; k<M; k++) {
	                        if (isInBounds(i - k, j, N)) plus += arr[i - k][j];
	                        if (isInBounds(i + k, j, N)) plus += arr[i + k][j];
	                        if (isInBounds(i, j - k, N)) plus += arr[i][j - k];
	                        if (isInBounds(i, j + k, N)) plus += arr[i][j + k];
						}
						max = Math.max(max, plus);
				}
			}
			// x 방향으로 분사
			for(int i = 0; i<=N; i++) {
				for(int j = 0; j<=N; j++) {
					int	x = 0;
						if (isInBounds(i,j,N))
							x += arr[i][j];
						
						for (int k = 1; k<M; k++) {
	                        if (isInBounds(i - k, j - k, N)) x += arr[i - k][j - k];
	                        if (isInBounds(i + k, j + k, N)) x += arr[i + k][j + k];
	                        if (isInBounds(i - k, j + k, N)) x += arr[i - k][j + k];
	                        if (isInBounds(i + k, j - k, N)) x += arr[i + k][j - k];
						}
						max = Math.max(max, x);
				}
			}
			
			System.out.println("#" + test_case + " " + max);
		}
		}
    	//N*N 배열에 있는지 확인
		private static boolean isInBounds(int x, int y, int N) {
			return x >= 0 && x < N && y >= 0 && y < N;
		
	}

}