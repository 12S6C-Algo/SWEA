package SWEA;

import java.io.*;

public class N1209_Sum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int T = 1; T < 11; T++) {
			int[][] inputs = new int[100][100];
			br.readLine();
			System.out.print("#" + T + " ");
			
			for (int i = 0; i < 100; i++) {
				String[] arr = br.readLine().split(" ");
				for (int j = 0; j < 100; j++) {
					inputs[i][j] = Integer.parseInt(arr[j]);
				}
			}
			
			int result = -1;
			
			int v = 0;
			int h = 0;
			int l = 0;
			int r = 0;
			//가로 세로 동시에
			for (int i = 0; i < 100; i++) {
				v = 0;
				h = 0;
				
				for (int j = 0; j < 100; j++) {
					v += inputs[i][j];
					h += inputs[j][i];
				}
				
				if (result < v) {
					result = v;
				}
				
				if (result < h) {
					result = h;
				}
				
				l += inputs[i][i];
				r += inputs[99-i][99-i];
			}
			
			result = result < l ? l : result;
			result = result < r ? r : result;
			
			System.out.println(result);
		}
		br.close();
	}
}
