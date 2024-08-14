import java.io.*;
import java.util.*;

public class 사칙연산 {
    static int N;
    static Node[] trees;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int test = 1; test <= 10; test++) {
            N = Integer.parseInt(br.readLine());
            trees = new Node[N + 1];

          // 입력을 받고, 받은 입력을 static N, trees에 입력
          // 이렇게 하는 이유는 tree를 다른 함수에서도 공유하여 쓰기 위함
          // 내가 푼 방법은 모든 [연산자]를 [오른]+[왼]의 합으로 변경해서
          // 쭉쭉 올려서 1번 노드에 최종 값이 나오도록 만듬
          
            for (int i = 1; i < N + 1; i++) {
                String[] inputNode = br.readLine().split(" ");
                Node node = new Node(inputNode[1]);
                int num = Integer.parseInt(inputNode[0]);
                trees[num] = node;
                if (isOperator(inputNode[1])) {
                    trees[num].left = Integer.parseInt(inputNode[2]);
                    trees[num].right = Integer.parseInt(inputNode[3]);
                }
            }
          // 여기까지 이해못하면 바보

          //여긴 실행구문
            postorder(1);
            System.out.println("#" + test + " " + trees[1].value);
        }
    }

  // 노드를 value는 값, left, right는 노드번호
    static class Node {
        String value;
        int left;
        int right;

        Node() {
        }
        
        Node(String value) {
            this.value = value;
        }
    }

  // 걍 사칙연산 확인
    static boolean isOperator(String s) {
        return s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/");
    }

//postorder 후위 순회 구현
    static void postorder(int root) {
        if (!(isOperator(trees[root].value)) || trees[root] == null || N + 1 < root) {
            return;
        }

// 좌우 ㄱㄱ
        postorder(trees[root].left);
        postorder(trees[root].right);

// 왼쪽 노드와 오른쪽 노드의 값을 가져옴
        int leftValue = Integer.parseInt(trees[trees[root].left].value);
        int rightValue = Integer.parseInt(trees[trees[root].right].value);

// 계산 해서 tree[root] 의 값을 바꿔줌
        String operator = trees[root].value;
        if (operator.equals("+")) {
            trees[root].value = Integer.toString(leftValue + rightValue);
        } else if (operator.equals("-")) {
            trees[root].value = Integer.toString(leftValue - rightValue);
        } else if (operator.equals("*")) {
            trees[root].value = Integer.toString(leftValue * rightValue);
        } else if (operator.equals("/")) {
            trees[root].value = Integer.toString(leftValue / rightValue);
        }
    }
}
