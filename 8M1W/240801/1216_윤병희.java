package SWEA;

import java.io.*;

public class N1216_회문2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 0; t < 10; t++) {
			int test = Integer.parseInt(br.readLine());
			System.out.print("#" + test + " ");
			String[][] inputs = new String[100][100];
			for (int i = 0; i < 100; i++) {
				String[] input = br.readLine().split("");
				for (int j = 0; j < 100; j++) {
					inputs[i][j] = input[j];
				}
			}
			int max = 1;
			for (int row = 0; row < 100; row++) {
				for (int i = 0; i < 100; i++) {
					loop: for (int j = i + max; j < 100; j++) {
						for (int k = 0; k <= (j-i)/2; k++) {
							if (!(inputs[row][i+k].equals(inputs[row][j-k]))) {
								continue loop;
							}
						}
						if (max < j-i+1) {
							max = j-i+1;
						}
					}
					
					loop: for (int j = i + max; j < 100; j++) {
						for (int k = 0; k <= (j-i)/2; k++) {
							if (!(inputs[i+k][row].equals(inputs[j-k][row]))) {
								continue loop;
							}
						}
						if (max < j-i+1) {
							max = j-i+1;
						}
					}
				}
			}
			System.out.println(max);
		}
	}
}
