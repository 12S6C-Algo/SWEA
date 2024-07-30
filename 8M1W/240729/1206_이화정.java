import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int N  = sc.nextInt();
			int[] arr = new int[N];
			for(int i = 0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			
			int sum = 0;
			for(int i = 2; i<N-2; i++) {
				int left = 0, right = 0;
				if(arr[i] > arr[i+1] && arr[i] > arr[i+2]) {
					if (arr[i+1] > arr[i+2]) {
						right = arr[i] - arr[i+1]; 
					}
					else
						right = arr[i] - arr[i+2];
				}
				
				if(arr[i] > arr[i-1] && arr[i] > arr[i-2]) {
					if (arr[i-1] > arr[i-2]) {
						left = arr[i] - arr[i-1];
					}
					else
						left = arr[i] - arr[i-2];
				}
				
				if(left > right) {
					sum += right;
				}
				else {
					sum += left;
				}
				
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
}