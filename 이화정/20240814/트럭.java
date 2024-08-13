import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 트럭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int N = sc.nextInt(); // 트럭의 수
        int W = sc.nextInt(); // 다리의 길이
        int L = sc.nextInt(); // 다리의 최대 하중

        int[] truck = new int[N];
        for (int i = 0; i < N; i++) {
            truck[i] = sc.nextInt();
        }

        int t = 0; // 시간
        int weight = 0;
        
        // 초기화: 다리를 W 길이만큼 0으로 채워줌
        for (int i = 0; i < W; i++) {
            queue.add(0);
        }

        int i = 0;
        while (i < N) {
            // 먼저 다리에서 한 칸 이동
            weight -= queue.poll();
            t++;

            // 트럭이 다리에 진입할 수 있는지 확인
            if (weight + truck[i] <= L) {
                queue.add(truck[i]);
                weight += truck[i];
                i++;
            } else {
                queue.add(0); // 트럭이 진입하지 못하면 0 추가
            }
        }

        // 마지막 트럭이 다리에서 빠져나오는 시간 추가
        t += W;

        System.out.println(t);
        sc.close();
    }
}
