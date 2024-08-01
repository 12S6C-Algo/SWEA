import java.util.Scanner;

public class sum한번더 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		for(int tc = 1 ; tc <= T; tc++) {
			sc.nextInt(); // 테스트케이스 번호 잡아먹기.!!!!!!!!!!!!!!!!!! 
//			 입력 받기를 안해주면 테스트 케이스 번호도 계산에 넣어버린다 
			
			
			int[][] arr = new int[100][100];
			
			for(int i = 0; i <100 ; i++) {
				for(int j = 0; j < 100 ; j++) {
					arr[i][j] = sc.nextInt();		
				}
			}
			
			int maxSum = -1;
			int d1Sum = 0;
			int d2Sum =0;
			
			for(int i = 0; i <100 ; i++) {
				int rSum = 0; 
				int cSum = 0; 
				for(int j= 0; j<100;j++) {
					rSum += arr[i][j]; //이건 +=
					cSum += arr[j][i];
				}
				maxSum = Math.max(maxSum, Math.max(rSum, cSum)); // =

					d1Sum += arr[i][i];
					d2Sum += arr[i][99-i];	
			}
			maxSum = Math.max(maxSum, Math.max(d1Sum, d2Sum));//대각선 for문 끝나고 넣기 
			
			System.out.println("#"+tc + " "+ maxSum);
		}//for문 끝 	
	
	}
}

