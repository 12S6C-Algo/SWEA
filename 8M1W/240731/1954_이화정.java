package 실습_240731;
import java.util.*;
import java.io.*;

public class Solution1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case<=T; test_case++) {
			int N = sc.nextInt();
			int num = 1; // 이동한 칸의 개수 -> N*N보다 커지면 종료
			int[][] arr = new int[N][N];
			int r = 0;
			int c = 0;
			int d = 0; // 방향을 의미
			int[] dr = {0, 1, 0, -1};
			int[] dc = {1, 0, -1, 0};
			
			while (num <= N*N) {
				arr[r][c] = num++;
				int nr = r + dr[d];
				int nc = c + dc[d];
				
				if(nr < 0 || nc < 0 || nr >= N || nc >= N || arr[nr][nc]!= 0) {
					d = (d+1) % 4;
					nr = r + dr[d];
					nc = c + dc[d];
				}
				r = nr;
				c = nc;		
			}
			
			System.out.println("#" + test_case);
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}