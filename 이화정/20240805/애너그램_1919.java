import java.util.Scanner;

public class 애너그램_1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        // 알파벳 빈도 배열
        int[] a_freq = new int[26]; // a-z, 총 26개
        int[] b_freq = new int[26]; // a-z, 총 26개
        
        // 문자열 a의 빈도 수를 기록
        for (char ch : a.toCharArray()) {
            a_freq[ch - 'a']++;
        }
        
        // 문자열 b의 빈도 수를 기록
        for (char ch : b.toCharArray()) {
            b_freq[ch - 'a']++;
        }
        
        // 제거해야 하는 문자 수 계산
        int removeCount = 0;
        for (int i = 0; i < 26; i++) {
            removeCount += Math.abs(a_freq[i] - b_freq[i]);
        }
        
        System.out.println(removeCount);
    }
}
