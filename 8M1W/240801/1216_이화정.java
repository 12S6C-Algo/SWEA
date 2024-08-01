package 실습_240801;
import java.util.*;
import java.io.*;

public class Solution2 {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		boolean flag;
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int c = Integer.parseInt(br.readLine());
			
			String[][] map = new String[100][100];
			int max = Integer.MIN_VALUE;
			
			for(int i = 0; i<100; i++) {
				map[i] = br.readLine().split("");
			}
			
			for(int length = 1; length<=100; length++) {
				for(int i = 0; i<100; i++) {
					for(int j = 0; j<100-length+1; j++) {
						flag = true;
						for(int k=0; k<length/2; k++) {
							if(!map[i][j+k].equals(map[i][j-k+length-1])) {
								flag = false;
								break;
							}
						}
						if(flag) {
							max = Math.max(max, length);
						}
					}
				}
				for(int i = 0; i < 100; i++) {
					for(int j = 0; j<100-length+1; j++) {
						flag = true;
						for(int k=0; k<length/2; k++) {
							if(!map[j+k][i].equals(map[j-k+length-1][i])) {
								flag = false;
								break;
							}
						}
						if(flag) {
							max = Math.max(max, length);
						}
					}
				}
			}
			
			System.out.println("#" + c + " " + max);
			
		}
	}
}
