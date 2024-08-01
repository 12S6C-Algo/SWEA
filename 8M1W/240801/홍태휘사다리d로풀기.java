import java.util.Scanner;

public class 사다리다시 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int test_num = sc.nextInt();

            int[][] ladder = new int[100][100];

            for (int r = 0; r < 100; r++) {
                for (int c = 0; c < 100; c++) {
                    ladder[r][c] = sc.nextInt();
                }
            }

            // 출발지점을 찾는다.
            int[] dc = {-1, 1};
            int col = 0;
            int row = 99;
            for (int c = 0; c < 100; c++) {
                if (ladder[99][c] == 2) {
                    col = c;
                    break;
                }
            }

            while (row > 0) {
                ladder[row][col] = 2; // 지나온 길 표시
                boolean moved = false;

                for (int d = 0; d < 2; d++) {
                    int nc = col + dc[d];
                    if (nc >= 0 && nc < 100 && ladder[row][nc] == 1) {
                        col = nc;
                        moved = true;
                        break;
                    }
                }

                if (!moved) {
                    row--;
                }
            }

            System.out.println("#" + test_num + " " + col);
        }
    }
}
