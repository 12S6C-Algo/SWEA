import java.util.Scanner;

public class Ladder1_1210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        for ( int i = 1 ; i <= 10 ; i++) {
            int test_num = sc.nextInt();
        	// 사다리를 만들어서 채움
            int[][] ladder = new int[100][100];
            
            for ( int j = 0 ; j < ladder.length ; j++) {
                for ( int k = 0 ; k < ladder[0].length ; k++) {
                    ladder[j][k] = sc.nextInt();
                }
            }
            // 2 찾기
            int start = -1;
            
            for ( int j = 0 ; j < ladder[99].length ; j++) {
                if ( ladder[99][j] == 2) {
                    start = j;
                }
            }
            int nowr = 99;
            int nowc = start;
            
            while( nowr != 0) {
                if ( nowc > 99 || nowc < 0) {
                    continue;
                }else if (nowc > 0 && ladder[nowr][nowc-1] == 1) {
                    while (nowc > 0 && ladder[nowr][nowc-1] == 1) {
                        nowc--;
                    }
                    nowr--;
                }else if (nowc < 99 && ladder[nowr][nowc+1] == 1) {
                    while (nowc < 99 && ladder[nowr][nowc+1] == 1) {
                        nowc++;
                    }
                    nowr--;
                }else {
                    nowr--;
                }
            }
            int answer = nowc;
            System.out.println("#"+test_num+" "+answer);
        }
    }
}
