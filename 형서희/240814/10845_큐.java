import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i < N; i++) {
			String request = br.readLine();
			StringTokenizer st = new StringTokenizer(request);
			
			if (st.nextToken().equals("push")) {
				
				int number = Integer.parseInt(st.nextToken());
				queue.add(number);
				
			} else if (request.equals("front")) {
				
				if (queue.isEmpty())
					System.out.println(-1);
				
				else
					System.out.println(queue.peek());
				
			} else if (request.equals("back")) {
				
				if (queue.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(((LinkedList<Integer>) queue).peekLast());
				
			} else if (request.equals("size")) {
				
				System.out.println(queue.size());
				
			} else if (request.equals("empty")) {
				
				if (queue.isEmpty())
					System.out.println(1);
				
				else
					System.out.println(0);
				
			} else if (request.equals("pop")) {
				
				if (queue.isEmpty())
					System.out.println(-1);
				
				else
					System.out.println(queue.poll());
			}
		}
	}
}
