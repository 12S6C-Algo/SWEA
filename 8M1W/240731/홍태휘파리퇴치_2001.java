import java.util.Scanner;

public class Swea_파리잡기 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int testCase = scanner.nextInt();
		
		for ( int i = 1 ; i <= testCase ; i++) {
			int fullSize = scanner.nextInt();
			int flySize = scanner.nextInt();
			//배열을 만들어 채움
			int[][] fullBox = new int[fullSize][fullSize];
			for ( int j = 0 ; j < fullSize ; j++) {
				for ( int k = 0 ; k < fullSize ; k++) {
					fullBox[j][k] = scanner.nextInt();
				}
			}
			int[][] answerBox = new int[fullSize-flySize+1][fullSize-flySize+1];
			for ( int j = 0 ; j < answerBox.length ; j++) {
				for ( int k = 0 ; k < answerBox[0].length ; k++) {
					for ( int l = 0 ; l < flySize ; l++) {
						for ( int m = 0 ; m < flySize ; m++) {
							answerBox[j][k] += fullBox[j+l][k+m];
						}
					}
				}
			}
			int max = -1;
			for ( int j = 0 ; j < answerBox.length ; j++) {
				for ( int k = 0 ; k < answerBox[0].length ; k++) {
					if ( max < answerBox[j][k])
						max = answerBox[j][k];
				}
			}
			System.out.println("#"+i+" "+max);
		}
	}

}
