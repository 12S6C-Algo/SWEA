
import java.util.Arrays;
import java.util.Scanner;

public class 애너그램만들기 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String alphaBet = scanner.nextLine();
		
		String alphaBet2 = scanner.nextLine();
		
		char [] alpha = alphaBet.toCharArray();
		
		char [] alpha2 = alphaBet2.toCharArray();
		
		char [] sample = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		int [] cnt = new int[sample.length];
		// 
		for ( int i = 0 ; i < alpha.length ; i++) {
			for ( int j = 0 ; j <sample.length ; j++) {
				if ( alpha[i] == sample[j]) {
					cnt[j]++;
				}
			}
		}
		int [] cnt2 = new int[sample.length];
		// 
		for ( int i = 0 ; i < alpha2.length ; i++) {
			for ( int j = 0 ; j <sample.length ; j++) {
				if ( alpha2[i] == sample[j]) {
					cnt2[j]++;
				}
			}
		}
		int diff = 0;
		for ( int i = 0 ; i < sample.length ; i++) {
			if (cnt != cnt2) {
				int k = cnt[i] - cnt2[i];
				diff += Math.abs(k);
			}
		}
		System.out.println(diff);
	
	}
}
