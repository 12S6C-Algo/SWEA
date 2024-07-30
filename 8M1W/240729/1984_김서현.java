import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T ; i++) {
			
			int[] arr = new int[10];
			double sum  = 0; //소수점 첫째 자리 반올림한 정수 double
			
			for(int j = 0; j<10; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			
			
			for(int j = 1; j<9; j++) {
				sum += arr[j];  		// j 
			}
			
			int avg = (int)Math.round(sum/8);
			System.out.println("#" + (i+1) + " " +avg );
			
    }	
	}
}
