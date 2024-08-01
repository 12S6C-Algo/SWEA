import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
         
        // 2차원 배열 선언
        int[][] board = new int[100][100];
         
        // 테스트 케이스와 2차원 배열 입력 받기
        for(int i = 1; i <= 10; i++) {
            int N = sc.nextInt();
             
            for(int k = 0; k < 100; k++) {
                for(int j = 0; j < 100; j++) {
                    board[k][j] = sc.nextInt();
                }
            }
             
            // 합 배열 설정
            int[] sumr = new int[100];
            int[] sumc = new int[100];
            int[] sumx = new int[2];
             
            int max = 0;
             
            // 행의 합
            for(int r = 0; r < 100; r++) {
                for(int c = 0; c < 100; c++) {
                    sumr[r] += board[r][c];
                }
                 
                if(max < sumr[r])
                    max = sumr[r];
            }
 
             
            // 열의 합
            for(int c = 0; c < 100; c++) {
                for(int r = 0; r < 100; r++) {
                    sumc[c] += board[r][c];
                }
                 
                if(max < sumc[c])
                    max = sumc[c];
            }
             
            // 대각선의 합
            for(int n = 0; n < 100; n++) {
                sumx[0] += board[n][n];
                sumx[1] += board[n][99-n];
            }
             
            if(max < sumx[0])
                max = sumx[0];
             
            if(max < sumx[1])
                max = sumx[1];
             
            System.out.printf("#" + i + " %d\n", max);
        }
 
         
         
    }
}
