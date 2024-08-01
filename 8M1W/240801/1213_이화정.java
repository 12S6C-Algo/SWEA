package 실습_240801;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			T=sc.nextInt();
			int result = 0;
			int[] arr = new int[1000];
			int[] pattern = new int[10];
		
			String patternString = sc.next();
			for(int i = 0; i < patternString.length(); i++) {
				pattern[i] = patternString.charAt(i);
			} // 구해야 할 문자열을 받아옴
			
			String s = sc.next();
			for(int i = 0; i < s.length(); i++) {
				arr[i] = s.charAt(i);
			} // 전체 문자열
			
			
			int N = s.length();
			int M = patternString.length();
			
			for(int i = 0; i< N-M+1; i++) {
				int tmp[] = new int[10];
				int idx = 0;
				for(int j = i; j<=i+(M-1); j++) {
					tmp[idx++] = arr[j];
				}
				if(Arrays.equals(tmp, pattern))
					result++;
				
			}
			
			System.out.println("#" + test_case + " " + result);
		}
	}
}
