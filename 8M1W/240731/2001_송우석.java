import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 파리퇴치_2001 {
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

            int max = 0;
            for (int r = 0; r <= N - M; r++) {
                for (int c = 0; c <= N - M; c++) {
                    int sum = 0;
                    for (int i = 0; i < M; i++) {
                        for (int j = 0; j < M; j++) {
                            sum += fly[r + i][c + j];
                        }
                    }
                    max = Math.max(max, sum);
                }
            }

            System.out.printf("#%d %d\n", t + 1, max);

        }
    }
}
