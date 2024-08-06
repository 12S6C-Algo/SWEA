package swea;

import java.util.Scanner;

public class 거듭제곱1217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		int N = 10;
		for( int tc = 1 ; tc <= N  ; tc++) {
			// tc값 받아주기 
			sc.nextInt(); 
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			//factorial(a,b)
			System.out.println("#"+tc+ " "+ pow(a,b) );
			
		}
		sc.close(); 
	}
	
	
	static int pow(int a , int b)	{
		if(b == 0) {
			return 1;
		}else {
			//재귀호출 a*factorial(a,b-1);
			//다시 pow를 호출했다는게 재귀 호출의 개념(문법)이다 
			return a * pow(a,b-1);
		}
	}	
}

