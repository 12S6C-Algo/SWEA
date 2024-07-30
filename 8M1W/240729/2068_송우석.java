package APS.Day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최대수_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= T; i++) {
            int[] findMaxValue = new int[10];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                findMaxValue[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(findMaxValue);

            System.out.printf("#%d %d\n",i, findMaxValue[9]);
        }
    }
}
