// 이중 for문으로 풀었는데 계속 시간 초과 나와서 지피티한테 물어봤더니 hashmap으로 풀라던데 설명 필요함
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 두수의합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int answer = Integer.parseInt(br.readLine()); // 여기서 새로운 입력을 받음
		
		// HashMap을 사용하여 시간 복잡도를 O(N)으로 줄임
		HashMap<Integer, Integer> map = new HashMap<>();
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			// 현재 숫자와 더해서 answer가 되는 숫자가 map에 있는지 확인
			if (map.containsKey(answer - arr[i])) {
				cnt += map.get(answer - arr[i]);
			}
			
			// 현재 숫자를 map에 추가 (개수를 세기 위해)
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		System.out.println(cnt);
	}
}
