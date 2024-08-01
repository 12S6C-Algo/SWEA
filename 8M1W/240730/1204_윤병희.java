package SWEA;

import java.io.*;

public class N1204_최빈수구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test = 0; test < T; test++) {
			int time = Integer.parseInt(br.readLine());
			String[] inputStrings = br.readLine().split(" ");
			
			int[] frequency = new int[101];
			
			for (int index = 0; index < 1000; index++) {
				int a = Integer.parseInt(inputStrings[index]);
				frequency[a] += 1;
			}
			
			int max = frequency[100];
			int maxIndex = 100;
			for (int index = 99; index >= 0; index--) {
				if (frequency[index] > max) {
					max = frequency[index];
					maxIndex = index;
				}
			}
			System.out.print("#" + time + " " + maxIndex);
			System.out.println();
		}
		
		br.close();
	}
}
