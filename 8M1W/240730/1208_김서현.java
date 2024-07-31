import java.util.Scanner;   //런타임 에러가 나버림

public class 평탄화1208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <1000 ; i++) {
			int dn = sc.nextInt(); //덤프횟수
			int[] arr = new int[100];
			
			for(int j = 0; j <100 ; j++) {
				arr[j] = sc.nextInt();
			}
			
			
			
			for(int k = 1; k <= dn; k++) { //차이값 반환
				
				for( int a = arr.length -1 ; a >0 ; a--) {
					for(int b = 0; b <a; b++) {
						if( arr[b] > arr[b+1]) {
							int tmp = arr[b+1];
							arr[b+1] = arr[b];
							arr[b] = tmp;
						}
					}
				}
				
				//배열에서 최대값 최소값 찾기
				int maxIndex = arr.length -1;
				int minIndex =  0;
				
				arr[maxIndex]--;
				arr[minIndex]++;
				
				//덤프 후 배열을 다시 오름차순으로 정렬 
				for(int a = 0; a< arr.length -1;a++ ) {
					for(int b = 0; b< arr.length -a -1; b++) {
						if( arr[b] > arr[b+1] ) {
							int tmp = arr[b];
							arr[b] = arr[b+1];
							arr[b+1] = tmp;
						}
					}
				}
				
				if(arr[arr.length -1]-arr[0] <= 1) {
					break;
				}
			}
				
				int max = arr[arr.length-1];
				int min = arr[0];
				int height_difference = max - min ;
				
				
				
				System.out.printf("#%d %d\n",(i+1),height_difference);
				
				
			
			
		}
	}
}
