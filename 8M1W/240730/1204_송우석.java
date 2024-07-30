package APS.Day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 최빈수_구하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            int[] scores = new int[101];    // 점수의 빈도를 저장할 배열
            int[] studentScore = new int[1000];

            br.readLine();

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 1000; j++) {
                studentScore[j] = Integer.parseInt(st.nextToken());
                scores[studentScore[j]]++;
            }

            int max = 0;
            int maxInd = 0;
            for (int j = 0; j < scores.length; j++) {
                if (max <= scores[j]) {
                    max = scores[j];
                    maxInd = j;
                }
            }
            System.out.printf("#%d %d\n",i+1, maxInd);
        }


    }
}
