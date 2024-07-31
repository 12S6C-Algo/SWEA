import java.util.Scanner;

public class 파리퇴치3_12712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int testCase = scanner.nextInt();
        
        for (int i = 1; i <= testCase; i++) {
            int fullSize = scanner.nextInt();
            int flySize = scanner.nextInt();
            // 배열을 만들어 채움
            int[][] fullBox = new int[fullSize][fullSize];
            for (int j = 0; j < fullSize; j++) {
                for (int k = 0; k < fullSize; k++) {
                    fullBox[j][k] = scanner.nextInt();
                }
            }
            
            int max = Integer.MIN_VALUE;
            
            // 각 시작점을 기준으로 파리채 모양을 검사
            for (int j = 0; j < fullSize; j++) {
                for (int k = 0; k < fullSize; k++) {
                    
                    // 더하기 모양
                    int plus = fullBox[j][k]; // 중심 값 포함
                    for (int l = 1; l < flySize; l++) {
                        if (j + l < fullSize) plus += fullBox[j + l][k]; // 아래쪽
                        if (j - l >= 0) plus += fullBox[j - l][k]; // 위쪽
                        if (k + l < fullSize) plus += fullBox[j][k + l]; // 오른쪽
                        if (k - l >= 0) plus += fullBox[j][k - l]; // 왼쪽
                    }
                    
                    // 곱하기 모양
                    int multiple = fullBox[j][k]; // 중심 값 포함
                    for (int l = 1; l < flySize; l++) {
                        if (j + l < fullSize && k + l < fullSize) multiple += fullBox[j + l][k + l]; // 오른쪽 아래 대각선
                        if (j - l >= 0 && k - l >= 0) multiple += fullBox[j - l][k - l]; // 왼쪽 위 대각선
                        if (j + l < fullSize && k - l >= 0) multiple += fullBox[j + l][k - l]; // 왼쪽 아래 대각선
                        if (j - l >= 0 && k + l < fullSize) multiple += fullBox[j - l][k + l]; // 오른쪽 위 대각선
                    }
                    
                    // 현재 위치에서의 최대값 갱신
                    int currentMax = Math.max(plus, multiple);
                    if (max < currentMax) {
                        max = currentMax;
                    }
                }
            }
            
            System.out.println("#" + i + " " + max);
        }
        
        scanner.close();
    }
}
