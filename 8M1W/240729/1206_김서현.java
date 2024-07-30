import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//입력 받기 테스트 케이스 반복적으로 받으니까 프린트까지 하고 중괄호 닫기 ~ 
		for(int tc = 1 ; tc <= 10; tc++) {
			int N = sc.nextInt(); //N = 건물의 갯수
			int[] arr = new int[N];
			for(int i = 0; i < N; i++) {//반복문
				arr[i] = sc.nextInt();  //각 건물의 높이들을 입력받는다 
			}
		
		
		//출력
			int cnt = 0;  //math.max 이용하기 
			for(int i = 2; i<N-2; i++) {
				int max = Math.max(arr[i-2], Math.max(arr[i-1], Math.max(arr[i+1], arr[i+2])));
				if( arr[i] > max)
					cnt += arr[i]- max;
			}
		
		
		
		System.out.println("#"+tc + " "+ cnt);
		}
	}
}
