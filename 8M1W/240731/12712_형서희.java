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
             
            // 파리 수 배열 fly 선언
            // 영역을 벗어날 스프레이를 고려해서 3*N 크기로 선언
            int[][] fly = new int[3 * N][3 * N];
             
            // 파리 수 fly 배열 중앙에 입력
            for(int r = N; r < 2 * N; r++) {
                for(int c = N; c < 2 * N; c++) {
                    fly[r][c] = sc.nextInt();
                }
            }
             
            // 잡을 수 있는 파리 수 최댓값 초기화
            int max = 0;
             
            // 파리채 들고 순회
            for(int r = N; r < 2 * N; r++) {
                for(int c = N; c < 2 * N; c++) {
                     
                    // 죽은 파리 수 (+)
                    int dead1 = 0;
                     
                    // 파리 잡기 (+)
                    for(int k = r - M + 1; k < r + M; k++) {
                        dead1 += fly[k][c];
                    }
                    for(int j = c - M + 1; j < c + M; j++) {
                        dead1 += fly[r][j];
                    }
                     
                    // 중앙에 겹친 값 빼주기
                    dead1 = dead1 - fly[r][c];
                     
                    // 죽은 파리 최댓값
                    max = Math.max(max, dead1);
                     
                    // 죽은 파리 수 (x)
                    int dead2 = 0;
     
                    // 파리 잡기 (x)
                    for(int j = 1 - M; j < M; j++) {
                        dead2 += fly[r + j][c + j];
                    }
                    for(int j = 1 - M; j < M; j++) {
                        dead2 += fly[r + j][c - j];
                    }
                     
                    // 중앙에 겹친 값 빼주기
                    dead2 = dead2 - fly[r][c];
                     
                    // 죽은 파리 최댓값
                    max = Math.max(max, dead2);             
                     
                }
            }
 
            System.out.printf("#" + i + " %d\n", max);
             
        }
 
    }
}
