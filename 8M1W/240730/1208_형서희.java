import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        
		for(int test_case = 1; test_case <= 10; test_case++) {
			int dump = sc.nextInt();
			int[] box = new int[100];
			
			// 상자 높이 입력
 			for(int i = 0; i < 100; i++) {
				box[i] = sc.nextInt();
			} 	

	 		// count 배열 설정
	 		int[] cnt = new int[101];
	 		
	 		// count 배열로 변경
	 		for(int i = 0; i < 100; i++) {
	 			cnt[box[i]]++;
	 		}
 			
	 		int min = 0;
	 		int max = 100;	
	 		
	 		for(int t = 0; t < dump; t++) {	
		 		while(cnt[max] == 0) {
		 			max--;
		 		}
		 		// 높은 상자 줄이기
		 		if(cnt[max] != 0) {
		 			cnt[max]--;
		 			cnt[max - 1]++;
		 		}
		 		while(cnt[min] == 0) {
		 			min++;
		 		}
		 		// 낮은 상자 늘리기
		 		if(cnt[min] != 0) {
		 			cnt[min]--;
		 			cnt[min + 1]++;
		 		}

            }
      
      // 므엉
			while(cnt[max] == 0) {
	 			max--;
	 		}
	 		while(cnt[min] == 0) {
	 			min++;
	 		}
            
             System.out.println("#" + test_case + " " + (max - min));
	 		}			
	}
}
