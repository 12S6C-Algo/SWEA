package 이화정_0730;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution3 {
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{	
			int count = sc.nextInt();
			int arr[] = new int[100];
			
			for(int i = 0; i<100; i++) {
				arr[i] = sc.nextInt();
			}
			
			int maxidx = 0;
			int minidx = 0;
			for (int i = 0; i<count; i++) {
				maxidx = 0;
				minidx = 0;
				int max = arr[0];
				int min = arr[0];
				for(int j = 1; j<100; j++) {
					if (max < arr[j]) {
						max = arr[j];
						maxidx = j;
					}
					if (min > arr[j]) {
						min = arr[j];
						minidx = j;
					}
				}
				arr[maxidx] -= 1;
				arr[minidx] += 1;				
			}

			int max = arr[0];
			int min = arr[0];
			for(int j = 1; j<100; j++) {
				if (max < arr[j]) {
					max = arr[j];
				}
				if (min > arr[j]) {
					min = arr[j];
				}
			}
			

			System.out.println("#" + test_case + " " + (max-min));

		}
	}
}