package Baekjoon;

import java.io.*;
import java.util.*;

public class N3273_두수의합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] inputString = br.readLine().split(" ");
		int X = Integer.parseInt(br.readLine());
		br.close();
		
		int result = 0;
		int[] results = new int[2000001];
		
		for (int i = 0; i < N; i++) {
			results[Math.abs(Integer.parseInt(inputString[i]) * 2 - X)] += 1;
		}
		
		for (int value : results) {
			if (value == 2) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}


//public class N3273_두수의합 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		String[] inputString = br.readLine().split(" ");
//		int X = Integer.parseInt(br.readLine());
//		br.close();
//
//		List<Integer> inputs = new ArrayList<Integer>();
//		for (int i = 0; i < N; i++) {
//			inputs.add(Integer.parseInt(inputString[i]));
//		}
//		inputs.sort(null);
//
//		int front = 0;
//		int end = 1;
//		int result = 0;
//		while (end < N && front < end) {
//			if (inputs.get(front) + inputs.get(end) < X) { 
//				end++;
//			}
////			if (inputs.get(front) + inputs.get(end) == X) {
////				front++;
////				end++;
////				result++;
////			} else if (inputs.get(front) + inputs.get(end) < X) {
////				
////			}
//		}
//
////System.out.println(result);
//	}
//}

//public class N3273_두수의합 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		String[] inputString = br.readLine().split(" ");
//		int X = Integer.parseInt(br.readLine());
//		br.close();
//
//		List<Integer> inputs = new ArrayList<Integer>();
//		for (int i = 0; i < N; i++) {
//			inputs.add(Integer.parseInt(inputString[i]));
//		}
//		inputs.sort(null);
//
//		int front = 0;
//		int end = N - 1;
//		int result = 0;
//		while (front < end) {
//			if (inputs.get(front) + inputs.get(end) == X) {
//				front++;
//				end--;
//				result++;
//			} else if (inputs.get(front) + inputs.get(end) < X) {
//			}
//		}
//
////	System.out.println(result);
//	}
//}

////시간 초과 정렬 필요 예상
//public class N3273_두수의합 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
//		String[] inputString = br.readLine().split(" ");
//		int X = Integer.parseInt(br.readLine());
//		br.close();
//		
//		int[] inputs = new int[N];
//		for (int i = 0; i < N; i++) {
//			inputs[i] = Integer.parseInt(inputString[i]);
//		}
//		
//		int result = 0;
//		for (int i = 0; i < N; i++) {
//			for (int j = i + 1; j < N; j++) {
//				if (inputs[i] + inputs[j] == X) {
//					result++;
//					continue;
//				}
//			}
//		}
//		
//		System.out.println(result);
//	}
//}
