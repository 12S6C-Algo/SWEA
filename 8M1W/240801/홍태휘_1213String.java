import java.util.Scanner;

public class String_1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for ( int test_case = 1 ; test_case <= 10 ; test_case++) {
			int test_num = sc.nextInt();
			String find = sc.next();
			String str = sc.next();
			
			int strIdx = 0;
			int findIdx = 0;
			int cnt = 0;
			while ( strIdx < str.length()) {
				if ( str.charAt(strIdx) != find.charAt(findIdx)) {
					
					strIdx -= findIdx;
					findIdx = -1;
				}
				strIdx++;
				findIdx++;
				
				if ( findIdx == find.length()) {
					cnt++;
					findIdx = 0;
				}
			
			}
			System.out.println("#"+test_num+" "+cnt);
		}
	}
}
