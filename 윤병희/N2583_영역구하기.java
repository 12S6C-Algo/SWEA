package Baekjoon;

import java.io.*;
import java.util.*;

// Class name -> Main

public class N2583_영역구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] MNK = br.readLine().split(" "); // 세로줄 r , 가로줄 c 개수  k
		
		int M = Integer.parseInt(MNK[0]);
		int N = Integer.parseInt(MNK[1]);
		int K = Integer.parseInt(MNK[2]);
		
		int[][] arr = new int[M][N];
		
		for (int a = 0; a < K; a++) {
			String[] input = br.readLine().split(" ");
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int x2 = Integer.parseInt(input[2]);
			int y2 = Integer.parseInt(input[3]);
			
			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++) {
					arr[y][x] = 1;
				}
			}
		}
		
		Stack<Integer[]> stack = new Stack<Integer[]>();
		Stack<Integer> result = new Stack<Integer>();
		int[] dr = {1, 0, -1, 0};
		int[] dc = {0, 1, 0, -1};
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				
				if (arr[i][j] != 0) {
					continue;
				}
				
				stack.push(new Integer[]{i, j});
				int cnt = 1;
				arr[i][j] = 1;
				while (!stack.isEmpty()) {
					Integer[] xy = stack.pop();
					int x = xy[0];
					int y = xy[1];
					for (int d = 0; d < 4; d++) {
						if (0 <= x + dr[d] && x + dr[d] < M && 0 <= y + dc[d] && y + dc[d] < N && arr[x + dr[d]][y + dc[d]] == 0) {
							stack.push(new Integer[] {x + dr[d], y + dc[d]});
							arr[x + dr[d]][y + dc[d]] = 1;
							cnt ++;
						}
					}
				}
				result.push(cnt);
			}
		}
		result.sort(null);
		
		System.out.println(result.size());
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
		br.close();
	}
}
