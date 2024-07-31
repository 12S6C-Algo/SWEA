package 실습_240731;

import java.util.*;
import java.io.*;

public class Solution2 {
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
			for(int i = 0; i<=N-M; i++) {
				for(int j = 0; j<=N-M; j++) {
					int sum = 0;
					for (int x = 0; x < M; x++) {
						for(int y = 0; y < M; y++) {
							sum += arr[i+x][j+y]; 
						}
					}
					if(max < sum)
						max = sum;
				}
			}
			
			System.out.println("#" + test_case + " " + max);
			
		}

	}

}
