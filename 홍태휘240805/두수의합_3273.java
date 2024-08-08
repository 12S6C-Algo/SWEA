import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (map.containsKey(answer - arr[i])) {
                cnt++;
            }
            map.put(arr[i], 1);
        }

        System.out.println(cnt);
    }
}
