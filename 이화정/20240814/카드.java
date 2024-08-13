import java.util.PriorityQueue;
import java.util.Scanner;

public class 카드{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }
        
        int totalCost = 0;
        
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int currentCost = first + second;
            totalCost += currentCost;
            pq.add(currentCost);
        }
        
        System.out.println(totalCost);
        sc.close();
    }
}