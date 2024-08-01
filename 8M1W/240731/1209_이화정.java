package 실습_240731;

import java.util.*;
import java.io.*;

public class Solution4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int test_case = 1; test_case<=10; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[100][100];
			
            for (int r = 0; r < 100; r++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int c = 0; c < 100; c++) {
                    arr[r][c] = Integer.parseInt(st.nextToken());
                }
            }
            
			int max = 0;
			for(int i = 0; i<100; i++) {
				int sum = 0;
				for(int j = 0; j<100 ; j++) {
					sum += arr[i][j];
				}
				max = Math.max(max, sum);
			}
			
			for(int j = 0; j<100; j++) {
				int sum = 0;
				for(int i = 0; i<100 ; i++) {
					sum += arr[i][j];
				}
				max = Math.max(max, sum);
			}
			
			int sum = 0;
			for(int i = 0; i<100; i++) {
				sum += arr[i][i];
				max = Math.max(max, sum);
			} 
			

			int r = 0;
			sum = 0;
			for(int i = 99; i>=0; i--) {
				sum += arr[r++][i];
				max = Math.max(max, sum);
			}
			
			
			
			System.out.println("#" + N + " " + max);
			
		}

	}

}