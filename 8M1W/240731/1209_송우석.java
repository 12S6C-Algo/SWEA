package APS.Day3;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_문제해결_기본_2일차_Sum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int t = 0; t < 10; t++) {
            int[][] arr = new int[100][100];
            int max = 0;

            br.readLine();

            for (int i = 0; i < 100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            max = solution(arr);
            System.out.printf("#%d %d\n", t+1, max);

        }

    }

    public static int solution( int[][] arr){
        int sum1 = 0;
        int sum2 = 0;
        int answer = Integer.MIN_VALUE;

        for(int i=0; i<100; i++){
            sum1 = 0; // 각 행의 합
            sum2 = 0; // 각 열의 합
            for(int j=0; j<100; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = 0;
        sum2 = 0;

        for(int i=0; i<100; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][100-i-1];
        }
        answer = Math.max(answer, sum1); //순대각선의 합
        answer = Math.max(answer, sum2); //역대각선의 합

        return answer;
    }


}
