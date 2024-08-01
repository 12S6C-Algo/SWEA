import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
        // 테스트 케이스 번호 입력
            int N = sc.nextInt();
            int[] score = new int[1000];
             
            // 학생 점수 입력
            for(int i = 0; i < 1000; i++) {
                score[i] = sc.nextInt();
            }
             
            // 점수별 빈도 배열 설정
            int[] count = new int[101];
             
            // 점수별 빈도 확인
            for(int i = 0; i < 1000; i++) {
                for(int j = 0; j <= 100; j++) {
                    if(score[i] == j) {
                        count[j]++;
                    }
                }
            }
             
            // 최대 빈도수 및 빈도값 확인
            int max = count[0];
            int maxscr = 0;
            for(int i = 1; i < 101; i++) {
                if(max <= count[i]) {
                    max = count[i];
                    maxscr = i;
                }
            }
             
            System.out.println("#" + N + " " + maxscr);
             
            }
 
    }
}
