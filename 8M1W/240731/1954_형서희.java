import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
 
        for(int tc = 1; tc <= T; tc++) {
            // N 입력 받기
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
             
            int cnt = 0; // 1 ~ N*N까지 반복
            int r = 0;
            int c = 0; // (0,0)부터 출발
            int d = 0; // 우(0), 하(1), 좌(2), 상(3)
             
            // 델타배열
            int[] dr = {0,1,0,-1};
            int[] dc = {1,0,-1,0};
             
            while(cnt++ < N*N) {
                // 1. 현재 (r,c) 위치에 cnt 넣기
                arr[r][c] = cnt;
                 
                // 2. 그 다음 좌표 만들기
                // 2-1. 일단 그 방향으로 좌표를 만든다.
                int nr = r + dr[d]; 
                int nc = c + dc[d]; 
                 
                // 2-2. 만약에 경계조건을 벗어낫거나, 이미 그 자리에 0이 아닌 숫자가 있는 경우.
                if( nr < 0 || nr >= N || nc < 0 || nc >= N || arr[nr][nc] != 0) {
                    d = (d+1) % 4; // 방향 전환
                    // 새로운 방향으로 새좌표를 다시 만들어서 뒤집어 쓴다.
                    nr = r + dr[d];
                    nc = c + dc[d];
                }
                 
                // if문을 나오고나면 (nr, nc)에 새로운 좌표가 들어있음.
                r = nr;
                c = nc;             
            }
             
            System.out.println("#"+tc);
             
            for(r=0; r<N; r++) {
                for(c=0; c<N; c++) {
                    System.out.print(arr[r][c]+" ");
                }
                System.out.println();
            }
             
        }
    }
}
