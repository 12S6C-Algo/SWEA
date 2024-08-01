import java.util.Scanner;
 
public class 달팽이숫자_1954 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
         
        for (int i = 1; i <= testCase; i++) {
            int N = scanner.nextInt();
            int[][] snail = new int[N][N];
            int rowStart = 0;
            int colStart = 0;
            int rowEnd = N-1;
            int colEnd = N-1;
            for (int j = 1; j <= N*N; j++) {
                while(rowStart <= rowEnd && colStart <= colEnd) {
                    for (int c = colStart; c <= colEnd; c++) {
                        snail[rowStart][c] = j;
                        j++;
                    }
                    rowStart++;
                     
                    for (int r = rowStart; r <= rowEnd; r++) {
                        snail[r][colEnd] = j;
                        j++;
                    }
                    colEnd--;
                    if (rowStart <= rowEnd) {
                        for (int col = colEnd; col >= colStart; col--) {
                            snail[rowEnd][col] = j;
                            j++;
                        }
                    }
                    rowEnd--;
                    if (colStart <= colEnd) {
                        for (int row = rowEnd; row >= rowStart; row--) {
                            snail[row][colStart] = j;
                            j++;
                        }
                    }
                    colStart++;
                }
            }
 
            System.out.println("#"+i);
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    System.out.print(snail[r][c]+" ");
                }
                System.out.println();
            }
             
        }
    }
}
