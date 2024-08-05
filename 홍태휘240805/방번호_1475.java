import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicFileChooserUI;

public class 방번호 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String door = br.readLine();
		
		char [] doorNum = door.toCharArray();
		
		char [] sample = {'0','1','2','3','4','5','6','7','8','9'};
		
		int[] cnt = new int[sample.length];
		
		for ( int i = 0 ; i < doorNum.length ; i++) {
			for ( int j = 0 ; j < sample.length ; j++) {
				if ( doorNum[i] == sample[j]) {
					cnt[j]++;
				}
			}
		}
		int[] cnt2 = new int[sample.length-1];
		
		for ( int i = 0 ; i < sample.length ; i++) {
			if (i == 9) {
				cnt2[6] += cnt[i];
			}else {
				cnt2[i] = cnt[i];
			}
		}
		cnt2[6] = cnt2[6]/2;
		int max = 0;
		for ( int i = 0 ; i < cnt2.length ; i++) {
			if ( max < cnt2[i]) {
				max = cnt2[i];
			}
		}
		System.out.println(max);
	}
}
