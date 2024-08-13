package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//독보적인 오버 타임
public class N1715_카드정렬하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		int result = 0;
		for (int i = 0; i < N-1; i++) {
			arr[i+1] += arr[i];
			result += arr[i+1];
			for (int j = i+1; j < N - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				} else {
					break;
				}
			}
		}
		System.out.println(result);
	}
}


//int[] arr = new int[] { 69, 10, 30, 2, 16, 8, 31, 22 };
//// 원소 개수 만크 싸이클
//// i 정렬되지 않은 집합의 첫번째 원소
//for (int i = 0; i < arr.length; i++) {
//	int data = arr[i];
//	// 정렬된 집합의 뒤에서부터 비교하여 위치 찾기
//	int j;
//	for (j = i - 1; j >= 0 && arr[j] > data; j--) {
//		arr[j + 1] = arr[j];
//	}
//	arr[j + 1] = data;
//}