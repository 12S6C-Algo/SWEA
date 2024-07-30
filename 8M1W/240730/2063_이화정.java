package 이화정_0730;

import java.util.Scanner;
import java.io.FileInputStream;


class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);


			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for (int i = 0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = N-1; i>0; i--) {
				for(int j = 0; j<i; j++) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}

			System.out.println(arr[N/2]);


	}
}