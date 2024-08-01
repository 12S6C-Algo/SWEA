import java.util.Scanner;

public class 달팽이내가해본거 { //값이 안나올땐 메모 + 엔터 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트 케이스 개수
		
		for(int tc = 1; tc <= T ; tc++) { //   <=
			int N = sc.nextInt(); //각 테스트 케이스에 주어지는 숫자 
			int[][] arr = new int[N][N];
			
			int cnt = 0;
			int r = 0; 	//행
			int c = 0;	//열
			int d = 0;	// 방향 우0 하1 좌2 상3
			
			while(cnt++ < N*N ) {
				arr[r][c] = cnt;   ///이거 뭐였더라?? 이거 맞나 => ㅇㅇ맞음
				
				if(d == 0 ) { //우
					if(c == N-1 ||(c < N-1 && arr[r][c+1]!=0)) {
						d = (d+1)%4;						//중요)! 그 다음 방향으로 갈 키 삽입!!!!!!!!!!
						r++;
					}
					else {
						c++;
					}
				}
				
				else if(d == 1) { //하 
					if(r == N-1 || (r<N-1 && arr[r+1][c]!=0)) {
						d= (d+1)%4;
						c--;
					}
					else {	
						r++;
					}
				}
				
				
				else if(d == 2) { //좌
					if(c == 0||(c  > 0 && arr[r][c-1]!=0) ) { //Q이것도 n-1 맞지?? 0 아니고???/
						d= (d+1)%4;
						r--;								// ==> n-1아님 0,0에서 시작하는거 생각해 , >0까지
					}
					else {	
						c--;
					}
				}
				
				else if(d == 3) { //상
					if(r == 0 || (r > 0 && arr[r-1][c]!=0)) {
					d = (d+1)%4;
					c++;
					}
					else {	
					r--;	
					}
				}
				
	
			} //while문 끝 
			
			
			System.out.println("#" + tc);
				for( r= 0; r<N ; r++) {	//위에서 int r 해줬으니까 int 사용하지 않음
					for( c =0; c<N ;c++) {
						System.out.print(arr[r][c] + " ");
				}
			System.out.println();
				}
			
		}//for문 끝 
		
	}
}
