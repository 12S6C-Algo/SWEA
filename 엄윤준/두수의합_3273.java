package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 두수의합_3273 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String sinput = br.readLine();
        
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(sinput);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            set.add(nums[i]);
        }
        int m = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(m - nums[i])) { // .contains 쓰려고 HashSet 쓰는 것 같습니다
                cnt++;
            }
        }
        System.out.println(cnt/2);
    }

}
