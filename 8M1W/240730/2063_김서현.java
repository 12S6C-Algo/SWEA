import java.util.Arrays;
import java.util.Scanner;

public class 중간값찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N개의 점수들 (입력)
		int N = sc.nextInt();
		//N개의 점수들이 있는 배열 생성
		int[] arr = new int[N];
		//점수들의 값 (입력)
		for(int i = 0; i<N ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//버블정렬(sort사용 하지 않기)
		for(int i = arr.length-1; i>0; i--) {
			for(int j = 0; j<i ; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	
		//중간값 출력
		System.out.println(arr[N/2]);
		//스캐너 종료
		sc.close();
		}			
}
