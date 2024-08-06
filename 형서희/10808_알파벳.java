import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		char[] word = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			word[i] = s.charAt(i);
		}

		// 'a' 97 'z' 122
		
		int[] count = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			count[(int)word[i] - 97]++;
		}
		
		for(int i = 0; i < 26; i++) 
			System.out.print(count[i] + " ");
	}
}
