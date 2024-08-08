import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 두수의합_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 배열의 크기 N을 읽기
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        // 배열의 각 요소를 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // X 값을 입력받기
        int X = Integer.parseInt(br.readLine());
        
        // 배열 정렬
        Arrays.sort(arr);
        
        // 투 포인터 기법을 사용하여 쌍을 찾기
        int left = 0;
        int right = N - 1;
        int count = 0;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == X) {
                count++;
                left++;
                right--;
            } else if (sum > X) {
                right--;
            } else {
                left++;
            }
        }
        
        // 결과 출력
        System.out.println(count);
    }
}
