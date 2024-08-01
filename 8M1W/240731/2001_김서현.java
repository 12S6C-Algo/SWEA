import java.util.Scanner;

public class 파리퇴치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	int T= sc.nextInt();
	for(int tc = 1; tc <= T ; tc++) {
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] arr = new int[N][N];
		for(int r = 0; r< N ; r++) {
			for(int c = 0; c < N ; c++) {
				arr[r][c] = sc.nextInt();
			}
		}
		
		int max = 0; //max 초기화 여기에, sum 옆에 말고 => max는 반복값이 아니고 비교할 값이기 때문
		
		for(int R = 0; R <= N- M ; R++) {
			for(int C = 0; C <= N- M  ; C ++) {
				
				int sum = 0; 
				
				for(int r = 0; r < M ; r++) {  //왜 r < M이지???? = > ex) N(5) M(2) 0,1만큼 돌아다님 
					for(int c = 0; c< M ; c++) { //r,c 작은 사각형 ~~ (= 파리채)
						int nr = R+r;
						int nc = C+c;
						
						sum += arr[nr][nc];
						}
					}
				if(sum > max) {
					max = sum;
					}
				}
			}
		System.out.println("#"+ tc + " "+ max);	//프린트는 포문 끝내기 직전에 
		}//큰 for문 끝 	
	}
}
