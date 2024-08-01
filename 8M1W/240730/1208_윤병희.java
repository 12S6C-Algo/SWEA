package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1208_Flatten {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int test = 0; test < 10; test++) {
			int count = Integer.parseInt(br.readLine());
			String[] inputStrings = br.readLine().split(" "); 
			
			int[] box = new int[101];
			
			for (int index = 0; index < 100; index++) {
				int boxHeight = Integer.parseInt(inputStrings[index]);
				box[boxHeight] += 1;
			}
			
			int left = 1;
			int right = 100;
			
			// for문이 효율이 더 좋았음
			for (int index = 0; index < count; index++) {
				if (left == right - 1) {
					break;
				}
				
				while (true) {
					if (box[left] == 0) {
						left++;
						continue;
					}
					
					if (box[right] == 0) {
						right--;
						continue;
					}
					
					break;
				}
				
				box[left] -= 1;
				box[right] -= 1;
				box[left + 1] += 1;
				box[right - 1] += 1;
			}
//			int totalCount = 0;
//			while (totalCount < count && !(left == right - 1)) {
//				while (true) {
//					if (box[left] == 0) {
//						left++;
//						continue;
//					}
//					
//					if (box[right] == 0) {
//						right--;
//						continue;
//					}
//					
//					break;
//				}
//				
//				box[left] -= 1;
//				box[right] -= 1;
//				box[left + 1] += 1;
//				box[right - 1] += 1;
//				totalCount++;
//			}
			
			if (box[left] == 0) {
				left++;
			}
			
			if (box[right] == 0) {
				right++;
			}
			
			System.out.print("#" + (test+1) + " " + (right - left));
			System.out.println();
		}
		
		br.close();
	}
}
