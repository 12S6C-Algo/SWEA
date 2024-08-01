import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 파리퇴치3_12712 {

    // 상하좌우 방향
    static int[] pdr = {-1, 1, 0, 0};
    static int[] pdc = {0, 0, -1, 1};

    // 대각선 상좌, 상우, 하좌, 하우 방향
    static int[] cdr = {-1, -1, 1, 1};
    static int[] cdc = {-1, 1, -1, 1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] fly = new int[N][N];

            for (int r = 0; r < N; r++) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < N; c++) {
                    fly[r][c] = Integer.parseInt(st.nextToken());
                }
            }

            int maxSum = 0;


            // 십자가 분사 방법을 사용하여 최대 살충량 계산
            int plusMax = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int sum = fly[i][j];
                    for (int k = 1; k < M; k++) {
                        for (int d = 0; d < 4; d++) {
                            int nr = i + pdr[d] * k;
                            int nc = j + pdc[d] * k;
                            if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                                sum += fly[nr][nc];
                            }
                        }
                    }
                    plusMax = Math.max(plusMax, sum);
                }
            }

            // 대각선 분사 방법을 사용하여 최대 살충량 계산
            int crossMax = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int sum = fly[i][j];
                    for (int k = 1; k < M; k++) {
                        for (int d = 0; d < 4; d++) {
                            int nr = i + cdr[d] * k;
                            int nc = j + cdc[d] * k;
                            if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                                sum += fly[nr][nc];
                            }
                        }
                    }
                    crossMax = Math.max(crossMax, sum);
                }
            }

            maxSum = Math.max(plusMax, crossMax);

            System.out.printf("#%d %d\n" , (t + 1) , maxSum);
        }
    }
}
