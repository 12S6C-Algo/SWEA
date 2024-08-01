package SWEA;

import java.io.*;

public class N1210_Ladder1 {
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
			
			for (int i = 0; i < 100; i++) {
				if (inputs[99][i] == 2) {
					result = i;
					break;
				}
			}
			
			for (int i = 98; i > 0; i--) {
				if (result - 1 > 0 && inputs[i][result - 1] == 1) {
					while (result - 1 > 0 && inputs[i][result - 1] == 1) {
						result --;
					}
				} else if (result + 1 < 100 && inputs[i][result + 1] == 1) {
					while (result + 1 < 100 && inputs[i][result + 1] == 1) {
						result ++;
					}
				}
			}
			System.out.println(result);
		}
		br.close();
	}
}
