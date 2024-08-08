package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백만장자프로잭트1859 {
	public static void main(String[] args) throws IOException{ 	// br --> st --> arr
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 	//문자열을 나눠서 받을 수 있는 스티링 토커나이저 생성
		
		int T = Integer.parseInt(br.readLine());	//총 테스트 케이스 개수 (T)
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine()); 	//각 케이스별 매매가 개수(N)
			int[] arr = new int[N];		//매매가 각 값들 배열생성(arr)
			st = new StringTokenizer(br.readLine()); //매매가 각 값들  	//br---->st
			
			
			
			for(int i = 0; i < N ; i++) {	//*이걸 주의하자 따로 for문 안에 입력받아줌 
			arr[i] = Integer.parseInt(st.nextToken());	//st ---> arr		arr에 st 넣는 과정
			}
			
			
			
			
			int maxPrice = arr[N-1]; 	//최고 값은 맨 뒤에 있다고 가정
			long totalPrice = 0;		//값이 길기 때문에 long으로 설정
			
			for(int i = N-2; i >=0; i--) {	//역방향, 한개 값은 max로 비교하니 N-2부터 
				
				if(arr[i] > maxPrice) {		//최고값보다 큰값이 나오면 그 값으로 갱신
					maxPrice = arr[i];
				}else {						//maxprice 가 최고값이라면 다른 값들과의 차이 덧셈갱신
					totalPrice += maxPrice - arr[i];
					}
				}
			
			System.out.println("#" + tc + " "+ totalPrice );	
			}
		
		}
		
	}

