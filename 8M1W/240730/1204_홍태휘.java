import java.util.Arrays;
import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
         
        for ( int i = 1 ; i <= 10 ; i++) {
            int testNum = scanner.nextInt();
            // 1000명의 성적을 받음
            int[] testScore = new int[1000];
            for ( int j = 0 ; j < 1000 ; j++) {
                testScore[j] = scanner.nextInt();
            }
             
            // 2. count 배열을 통해 원소 count
            int[] count = new int[101];
             
            for (int j = 0; j < testScore.length ; j++) {
                count[testScore[j]]++;
            }
             
            int max = -1;
            int maxNum = 100;
            for ( int j = count.length - 1 ; j >= 0 ; j--) {
                if ( max < count[j]) {
                    max = count[j];
                    maxNum = j;
                }
            }
             
            System.out.println("#"+i+" "+maxNum);
        }
         
    }
}
