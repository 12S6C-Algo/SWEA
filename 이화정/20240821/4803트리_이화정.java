import java.util.*;

public class dsf {
    // �׷����� �����ϴ� ����Ʈ (������ ���� ����Ʈ)
    static List<ArrayList<Integer>> graph;
    
    // ������ �湮�ߴ��� ���θ� �����ϴ� �迭
    static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = 1;  // �׽�Ʈ ���̽� ��ȣ
        
        while(true) {
            int n = sc.nextInt();  // ������ ��
            int m = sc.nextInt();  // ������ ��
            
            // �Է��� 0 0�̸� ���� (�׽�Ʈ ���̽� ����)
            if(n == 0 && m == 0)
                break;
            
            // �׷��� �ʱ�ȭ
            graph = new ArrayList<>();
            for(int i = 0; i<n+1; i++) {
                graph.add(new ArrayList<>());
            }
            
            // �湮 ���� �迭 �ʱ�ȭ
            visited = new boolean[n+1];
            
            // ���� �Է� �ޱ�
            for(int i = 0; i<m; i++) {
                int a = sc.nextInt();  // ������ ���� ����
                int b = sc.nextInt();  // ������ �ٸ��� ����
                
                // ����� �����̹Ƿ� ���ʿ� �߰�
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            
            int tree = 0;  // Ʈ���� ������ �����ϴ� ����
            
            // ��� ������ ���� �湮���� ���� �������� �����Ͽ� Ʈ�� ���θ� Ȯ��
            for (int i = 1; i < n+1; i++) {
                if(!visited[i]) {
                    tree += checkTree(i);  // Ʈ����� tree�� 1 ����
                }
            }
            
            // ��� ���
            System.out.print("Case " + test_case + ": ");
            
            if(tree > 1) {
                System.out.print("A forest of " + tree + " trees.");  // ���� ���� Ʈ���� �ִ� ���
            } else if(tree == 1) {
                System.out.print("There is one tree.");  // Ʈ���� �� �� �ִ� ���
            } else {
                System.out.print("No trees.");  // Ʈ���� ���� ���
            }
            
            System.out.println();
            
            test_case++;  // �׽�Ʈ ���̽� ��ȣ ����
        }
    }
    
    // �־��� �������� �����Ͽ� ����� �������� Ʈ���� �̷���� Ȯ���ϴ� �Լ�
    private static int checkTree(int root) {
        Queue<Integer> q = new LinkedList<>();  // BFS�� ���� ť
        int node = 0;  // �湮�� ���(����)�� ��
        int edge = 0;  // ������ ��
        
        q.add(root);  // ���� ������ ť�� �߰�
        
        while(!q.isEmpty()) {
            int c = q.poll();  // ť���� ������ �ϳ� ����
            
            if(visited[c]) continue;  // �̹� �湮�� �����̸� �ǳʶ�
            visited[c] = true;  // �湮 ǥ��
            node++;  // �湮�� ��� �� ����
            
            // ���� ������ ����� ��� ���� Ȯ��
            for(int i = 0; i<graph.get(c).size(); i++) {
                int nn = graph.get(c).get(i);  // ������ ����
                edge++;  // ���� �� ����
                
                // ������ ������ ���� �湮���� �ʾҴٸ� ť�� �߰�
                if (!visited[nn]) {
                    q.add(nn);
                }
            }
        }
        
        // Ʈ���� ����: ��� ���� ���� ���� Ʈ�� ������ �����ϴ��� Ȯ��
        return (edge / 2) + 1 == node ? 1 : 0;
    }
}
