package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * https://www.acmicpc.net/problem/1919
 * 첫번째 input을 받아서 26개의 알파벳 배열을 담음, 97부터 a.
 * 첫번째 단어 파싱해서 + 적용, 
 * 두번째 단어 파싱해서 - 적용
 * 절대값 구함
 */

public class N1919_애너그램만들기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		String input2 = br.readLine();
		br.close();
		int[] results = new int[26];

		for (int i = 0; i < input1.length(); i++) {
			results[(int) input1.charAt(i) - 97]++;
		}

		for (int i = 0; i < input2.length(); i++) {
			results[(int) input2.charAt(i) - 97]--;
		}

		int result = 0;
		for (int i : results) {
			result += i >= 0 ? i : -i;
		}		
		System.out.println(result);
	}
}
