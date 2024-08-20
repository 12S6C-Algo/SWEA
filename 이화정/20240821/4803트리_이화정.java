import java.util.*;

public class dsf {
    // 그래프를 저장하는 리스트 (정점의 인접 리스트)
    static List<ArrayList<Integer>> graph;
    
    // 정점을 방문했는지 여부를 저장하는 배열
    static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = 1;  // 테스트 케이스 번호
        
        while(true) {
            int n = sc.nextInt();  // 정점의 수
            int m = sc.nextInt();  // 간선의 수
            
            // 입력이 0 0이면 종료 (테스트 케이스 종료)
            if(n == 0 && m == 0)
                break;
            
            // 그래프 초기화
            graph = new ArrayList<>();
            for(int i = 0; i<n+1; i++) {
                graph.add(new ArrayList<>());
            }
            
            // 방문 여부 배열 초기화
            visited = new boolean[n+1];
            
            // 간선 입력 받기
            for(int i = 0; i<m; i++) {
                int a = sc.nextInt();  // 간선의 한쪽 정점
                int b = sc.nextInt();  // 간선의 다른쪽 정점
                
                // 양방향 간선이므로 양쪽에 추가
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            
            int tree = 0;  // 트리의 개수를 저장하는 변수
            
            // 모든 정점에 대해 방문하지 않은 정점에서 시작하여 트리 여부를 확인
            for (int i = 1; i < n+1; i++) {
                if(!visited[i]) {
                    tree += checkTree(i);  // 트리라면 tree를 1 증가
                }
            }
            
            // 결과 출력
            System.out.print("Case " + test_case + ": ");
            
            if(tree > 1) {
                System.out.print("A forest of " + tree + " trees.");  // 여러 개의 트리가 있는 경우
            } else if(tree == 1) {
                System.out.print("There is one tree.");  // 트리가 한 개 있는 경우
            } else {
                System.out.print("No trees.");  // 트리가 없는 경우
            }
            
            System.out.println();
            
            test_case++;  // 테스트 케이스 번호 증가
        }
    }
    
    // 주어진 정점에서 시작하여 연결된 정점들이 트리를 이루는지 확인하는 함수
    private static int checkTree(int root) {
        Queue<Integer> q = new LinkedList<>();  // BFS를 위한 큐
        int node = 0;  // 방문한 노드(정점)의 수
        int edge = 0;  // 간선의 수
        
        q.add(root);  // 시작 정점을 큐에 추가
        
        while(!q.isEmpty()) {
            int c = q.poll();  // 큐에서 정점을 하나 꺼냄
            
            if(visited[c]) continue;  // 이미 방문한 정점이면 건너뜀
            visited[c] = true;  // 방문 표시
            node++;  // 방문한 노드 수 증가
            
            // 현재 정점과 연결된 모든 정점 확인
            for(int i = 0; i<graph.get(c).size(); i++) {
                int nn = graph.get(c).get(i);  // 인접한 정점
                edge++;  // 간선 수 증가
                
                // 인접한 정점이 아직 방문되지 않았다면 큐에 추가
                if (!visited[nn]) {
                    q.add(nn);
                }
            }
        }
        
        // 트리의 조건: 노드 수와 간선 수가 트리 조건을 만족하는지 확인
        return (edge / 2) + 1 == node ? 1 : 0;
    }
}
