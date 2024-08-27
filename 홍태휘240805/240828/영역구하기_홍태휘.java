package 백준;

import java.util.*;

public class 영역구하기 {
    static int M, N, K;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        M = sc.nextInt(); // 세로 길이
        N = sc.nextInt(); // 가로 길이
        K = sc.nextInt(); // 직사각형의 개수
        
        map = new int[M][N];
        visited = new boolean[M][N];
        
        // 직사각형 위치 입력받아 map에 표시
        for (int i = 0; i < K; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    map[y][x] = 1;
                }
            }
        }
        
        List<Integer> areas = new ArrayList<>();
        
        // map을 순회하며 BFS 또는 DFS를 이용해 영역의 넓이 계산
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    areas.add(bfs(i, j));
                }
            }
        }
        
        // 영역의 개수와 각 영역의 넓이 출력
        Collections.sort(areas);
        System.out.println(areas.size());
        for (int area : areas) {
            System.out.print(area + " ");
        }
    }
    
    // BFS를 이용해 영역의 넓이를 계산하는 함수
    static int bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        visited[y][x] = true;
        int area = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curY = current[0];
            int curX = current[1];
            area++;
            
            for (int i = 0; i < 4; i++) {
                int ny = curY + dy[i];
                int nx = curX + dx[i];
                
                if (ny >= 0 && ny < M && nx >= 0 && nx < N) {
                    if (map[ny][nx] == 0 && !visited[ny][nx]) {
                        queue.add(new int[]{ny, nx});
                        visited[ny][nx] = true;
                    }
                }
            }
        }
        
        return area;
    }
}

