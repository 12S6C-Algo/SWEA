import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //총 시행 횟수
        for ( int cases = 1 ; cases <= 10 ; cases++) {
            int changeNum = scanner.nextInt();
            int[] boxes = new int[100]; 
            //박스들을 받음
            for ( int j = 0 ; j < 100 ; j++) {
                boxes[j] = scanner.nextInt();
            }
            // 각 숫자의 횟수 배열로 바꿈
            int[] count = new int[101];
             
            for ( int j = 0 ; j < 100 ; j++) {
                count[boxes[j]]++;
            }
            int max = 100;
            int min = 0;
            for ( int j = 0 ; j < changeNum ; j++) {
                while(count[max] == 0) {
                    max--;
                }
                if ( count[max] != 0) {
                    count[max]--;
                    count[max-1]++;
                }
                while(count[min] == 0) {
                    min++;
                }
                if ( count[min] != 0) {
                    count[min]--;
                    count[min+1]++;
                }
            }
            while(count[max] == 0) {
                max--;
            }
            while(count[min] == 0) {
                min++;
            }
            System.out.println("#"+cases+" "+(max - min));
        }
    }
}
