
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_문제해결_기본_3일차_String_1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            // 테스트 케이스 번호 입력
            br.readLine();

            // 찾을 문자열 입력
            String searchStr = br.readLine();
            int s = searchStr.length();

            // 원본 문자열 입력
            String originStr = br.readLine();
            int o = originStr.length();

            int count = 0;

            // 원본 문자열에서 찾을 문자열의 시작 인덱스를 0부터 끝까지 검사
            for (int j = 0; j <= o - s; j++) {
                if (originStr.substring(j, j + s).equals(searchStr)) {
                    count++;
                }
            }

            System.out.printf("#%d %d\n", i + 1, count);
        }
    }
}
