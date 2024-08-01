import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
         
        // 케이스 수 입력
        int T = sc.nextInt();
         
        for(int i = 1; i <= T; i++) {
            // 배열 가로세로 길이 N과 스프레이 분사 세기 M 입력
            int N = sc.nextInt();
            int M = sc.nextInt();
             
            // Existing 파리 수 배열 fly선언
            int[][] fly = new int[N][N];
             
            // Existing 파리 수 fly 입력
            for(int r = 0; r < N; r++) {
                for(int c = 0; c < N; c++) {
                    fly[r][c] = sc.nextInt();
                }
            }
             
            // 잡을 수 있는 파리 수 최댓값 초기화
            int max = 0;
             
            // 파리채 들고 순회
            for(int r = 0; r < N - M + 1; r++) {
                for(int c = 0; c < N - M + 1; c++) {
                     
                    // 죽은 파리 수 (+)
                    int dead1 = 0;
                     
                    // 파리 잡기 (+)
                    for(int k = r; k < r + M; k++) {
                        for(int j = c; j < c + M; j++) {
                            dead1 += fly[k][j];
                        }
                    }
                     
                    // 죽은 파리 최댓값
                    max = Math.max(max, dead1);
     
                }
            }
 
            System.out.printf("#" + i + " %d\n", max);
             
        }
         
    }
}
