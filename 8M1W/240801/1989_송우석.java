
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 초심자의_회문_1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());    //테스트 케이스

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();

            if (str.equals(reverse)) {
                System.out.printf("#%d %d\n", i + 1, 1);
            } else {
                System.out.printf("#%d %d\n", i + 1, 0);
            }

        }

    }
}
