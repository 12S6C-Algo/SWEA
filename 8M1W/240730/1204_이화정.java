package 이화정_0730;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;


class Solution2 {
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int number = sc.nextInt();
			int[] arr = new int[1000];
			
			for(int i = 0; i<1000; i++) {
				arr[i] = sc.nextInt();
			}
			
			int[] count = new int[101];
			
			for(int i = 0; i<1000; i++) { // i는 학생 번호
				for(int j = 0; j<=100; j++) { // j는 점수
					if(arr[i] == j) {
						count[j] += 1;
					}
				}
			}
			// index가 점수이고, count안의 값이 점수의 개수
			// 최소 개수의 점수를 찾아야 함!
			int max = count[0];
			int maxidx = 0;
			for(int i = 1; i<101; i++) {
				if(max <= count[i]) {
					max = count[i];
					maxidx = i;
				}
			}
			System.out.println("#" + number + " " + maxidx);

		}
	}
}