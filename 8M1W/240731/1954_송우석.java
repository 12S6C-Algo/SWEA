import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이숫자_1954 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];

            int num = 1;
            int row = 0, col = 0;
            int[] dr = {0, 1, 0, -1}; // 행 이동 (오른쪽, 아래, 왼쪽, 위)
            int[] dc = {1, 0, -1, 0}; // 열 이동 (오른쪽, 아래, 왼쪽, 위)
            int direction = 0; // 현재 방향 인덱스

            while (num <= N * N) {
                arr[row][col] = num++;
                int nextRow = row + dr[direction];
                int nextCol = col + dc[direction];

                // 경계를 벗어나거나 이미 값이 채워진 경우 방향 전환
                if (nextRow < 0 || nextRow >= N || nextCol < 0 || nextCol >= N || arr[nextRow][nextCol] != 0) {
                    direction = (direction + 1) % 4; // 방향을 다음으로 전환
                    nextRow = row + dr[direction];
                    nextCol = col + dc[direction];
                }

                row = nextRow;
                col = nextCol;
            }

            System.out.printf("#%d\n", t + 1);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
