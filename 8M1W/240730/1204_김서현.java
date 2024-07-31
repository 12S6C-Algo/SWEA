//score대신에  count

import java.util.Scanner;

public class 최빈수1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 0; test_case < T; test_case++) {
			int case_num = sc.nextInt();
			int[] count = new int[101]; //0점부터 100점까지 101가지의 점수 
			
				for(int i = 0; i < 1000 ; i++) {
					int s= sc.nextInt(); //각각의 점수 입력받음 
					count[s]++; //점수들의 빈도 측정   갑자기 s 사용하는거 모르겠음 i는 여기서 어떤 역할?
				} // i는 1000개의 점수를 입력 받고 각 점수의 빈도를 count 배열에 기록 
				//s = 사용자로부터 입력받은 점수를 저장하는 변수 

				
				
				int max = 0;
				int result = 0;
				for(int i = 0;i<count.length;i++) {
					if(count[i] >= max) { // >=
						max = count[i]; //if {}
						result = i;
					}	
				}
		System.out.printf("#%d %d\n", case_num , result);
		}
	}
}
