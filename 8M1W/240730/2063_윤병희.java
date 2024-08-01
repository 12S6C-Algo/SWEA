package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//18,404 kb 114 ms
public class N2063_중간값찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		String[] inputString = bf.readLine().split(" ");
		int[] inputs = new int[N];
		
		for (int i = 0; i < N; i++) {
			inputs[i] = Integer.parseInt(inputString[i]);
		}
		
		bf.close();
		inputs = bubbleSort(inputs);
		System.out.println(inputs[inputs.length/2]);
	}
	
	public static int[] bubbleSort(int[] inputs) {
		int[] result = inputs;
		
		int length = inputs.length;
		int tmp;
		
		// Cycle
		for (int cycle = 0; cycle < length -1; cycle++) {
			// Cycle 연산
			for (int index = 0; index < length -1; index++) {
				if (inputs[index] > inputs[index + 1]) {
					tmp = inputs[index];
					inputs[index] = inputs[index + 1];
					inputs[index+1] = tmp;
				}
			}
		}
		
		return result;
	}
}
