import java.util.Arrays;
import java.util.Scanner;

public class 방번호_1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        
        // 숫자의 빈도 수를 기록할 배열
        int[] count = new int[10];
        
        // 문자열 N에서 각 숫자의 빈도 수를 기록
        for (char c : N.toCharArray()) {
            count[c - '0']++;
        }
        
        int set = (count[6] + count[9] + 1) / 2;
        int max = set;
        for(int i = 0; i<10; i++) {
        	if(i != 6 && i != 9) {
        		max = Math.max(max, count[i]);
        	}
        }
        
        
        System.out.println(max);
    }
}
