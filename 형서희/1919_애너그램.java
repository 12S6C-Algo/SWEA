import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int[] str1cnt = new int[26];
		int[] str2cnt = new int[26];
		
		for(int i = 0; i < str1.length(); i++) {
			str1cnt[str1.charAt(i) - 'a']++;
		}
		for(int i = 0; i < str2.length(); i++) {
			str2cnt[str2.charAt(i) - 'a']++;
		}
		
		int cnt = 0;
		for(int i = 0; i < 26; i++) {
			if(str1cnt[i] != str2cnt[i])
				cnt += Math.abs(str1cnt[i] - str2cnt[i]);
		}
		
		System.out.println(cnt);
		
	}
}
