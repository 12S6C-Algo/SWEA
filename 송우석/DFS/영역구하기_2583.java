import java.io.*;
import java.util.*;

public class Main {
    // 이동 방향 배열 (상하좌우)
    static final int dx[] = {0, 0, 1, -1};
    static final int dy[] = {1, -1, 0, 0};
    static int n, m, count; // n: 세로 크기, m: 가로 크기, count: 현재 영역의 크기
    static int square[][]; // 격자를 저장하는 2차원 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 첫 줄에서 격자의 크기(n, m)와 직사각형의 개수(k)를 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 격자의 세로 크기
        m = Integer.parseInt(st.nextToken()); // 격자의 가로 크기
        int k = Integer.parseInt(st.nextToken()); // 직사각형의 개수
        
        // 격자 초기화
        square = new int[n][m];
        
        // k개의 직사각형 좌표를 입력받아 해당 영역을 격자에서 1로 표시 (채워진 영역)
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()); // 직사각형의 왼쪽 아래 x 좌표
            int y1 = Integer.parseInt(st.nextToken()); // 직사각형의 왼쪽 아래 y 좌표
            int x2 = Integer.parseInt(st.nextToken()); // 직사각형의 오른쪽 위 x 좌표
            int y2 = Integer.parseInt(st.nextToken()); // 직사각형의 오른쪽 위 y 좌표
            
            // 직사각형의 범위에 해당하는 격자를 1로 채움
            for (int y = y1; y < y2; y++) { 
                for (int x = x1; x < x2; x++){ 
                    square[y][x] = 1; // 직사각형 영역을 1로 표시
                }
            }
        }
        
        // 빈 영역의 크기를 저장할 리스트
        ArrayList<Integer> areaCount = new ArrayList<>();
        
        // 격자를 순회하며 빈 영역(0)을 찾아 DFS로 크기를 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 빈 영역을 발견하면 DFS 탐색 시작
                if (square[i][j] == 0) {
                    count = 0; // 영역 크기 초기화
                    dfs(i, j); // DFS로 연결된 모든 빈 칸 탐색
                    areaCount.add(count); // 탐색이 끝나면 영역 크기 저장
                }
            }
        }
        
        // 영역 크기를 오름차순으로 정렬
        Collections.sort(areaCount);
        
        // 결과 출력: 빈 영역의 개수와 각 영역의 크기
        sb.append(areaCount.size()).append('\n'); // 빈 영역의 개수
        for (int i : areaCount)  {
            sb.append(i + " "); // 각 영역의 크기 출력
        }
        
        System.out.println(sb); // 최종 결과 출력
    }
    
    // DFS로 연결된 빈 칸 탐색
    static void dfs(int x, int y) {
        square[x][y] = 1; // 방문한 칸은 1로 변경 (방문 처리)
        count++; // 영역의 크기 증가
        
        // 상하좌우로 이동하며 연결된 빈 칸을 탐색
        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k]; // 다음 x 좌표
            int ny = y + dy[k]; // 다음 y 좌표
            
            // 격자 범위 내에 있고, 아직 방문하지 않은 빈 칸(0)이라면 DFS 탐색
            if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                if (square[nx][ny] == 0) {
                    dfs(nx, ny); // 재귀적으로 DFS 수행
                }
            }
        }
    }
}
