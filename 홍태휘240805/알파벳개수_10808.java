
import java.util.Arrays;
import java.util.Scanner;

public class 알파벳개수 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String alphaBet = scanner.nextLine();
		
		char [] alpha = alphaBet.toCharArray();
		
		char [] sample = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		int [] cnt = new int[sample.length];
		
		for ( int i = 0 ; i < alpha.length ; i++) {
			for ( int j = 0 ; j <sample.length ; j++) {
				if ( alpha[i] == sample[j]) {
					cnt[j]++;
				}
			}
		}
		for ( int i = 0 ; i < cnt.length ; i++) {
			System.out.print(cnt[i]+" ");
		}
	}
}
