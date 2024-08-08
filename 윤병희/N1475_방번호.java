package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * https://www.acmicpc.net/problem/1475
 * 아스키 코드 사용
 * 받아서 6+9 는 같이 사용됨
 * 6 + 9 를 절반 나눠서 짝수일때, 홀수일때를 대비
 */

public class N1475_방번호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		br.close();
		int[] results = new int[10];
		
		for (int i = 0; i < input.length(); i++) {
			results[(int) input.charAt(i) - 48]++; //48~57
		}
		
		results[6] = (results[6] + results[9]) % 2 == 0 ? (results[6] + results[9]) / 2 : (results[6] + results[9]) / 2 + 1;
		int result = 0;
		for (int i = 0; i < 9; i++) {
			if (result < results[i]) {
				result = results[i];
			}
		}
		
		System.out.println(result);
	}
}
