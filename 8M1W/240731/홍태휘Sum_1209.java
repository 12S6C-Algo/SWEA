import java.util.Scanner;

public class Sum_1209 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int test_cases = 1 ; test_cases <=10 ; test_cases++) {
			int test_num = sc.nextInt();
			//2차원 배열을 만들어서 넣음
			int[][] numTable = new int[100][100];
			for ( int i = 0 ; i < numTable.length ; i++) {
				for ( int j = 0 ; j < numTable[0].length ; j++) {
					numTable[i][j] = sc.nextInt();
				}
			}
			// 합을 저장할 1차원 배열을 만들
			int[] sumTable = new int[202];
			//각 행의 합을 저장함
			for ( int i = 0 ; i < numTable.length ; i++) {
				for ( int j = 0 ; j < numTable[0].length ; j++) {
					sumTable[i] += numTable[i][j]; 
				}
			}// 각 열의 합을 저장함
			for ( int j = 0 ; j < numTable[0].length ; j++) {
				for ( int i = 0 ; i < numTable.length ; i++) {
					sumTable[j+100] += numTable[i][j];
				}
			}
			// 우하향 대각선의 합을 구함
			for ( int i = 0 ; i < numTable.length ; i++) {
				sumTable[200] += numTable[i][i];
			}
			// 좌하향 대각선의 합을 구함
			for ( int i = 0 ; i < numTable.length ; i++) {
				sumTable[201] += numTable[i][numTable.length-i-1];
			}
			int max = -1;
			for ( int i = 0 ; i < sumTable.length ; i++) {
				if ( max < sumTable[i])
					max = sumTable[i];
			}
			System.out.println("#"+test_num+" "+max);
		}
	}

}
