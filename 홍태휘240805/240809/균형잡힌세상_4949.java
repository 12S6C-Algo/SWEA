import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			// 글자를 받음
			String str = br.readLine();
			// 온점 "."만 있는 줄을 만나면 종료
			if ( str.equals(".")) 
				break;
			// 결과 값을 위한 boolean
			boolean isBalanced = true;
			// 스택으로 풀거라 스택 만듦
			Stack<Character> stack = new Stack<>();
			
			for ( int i = 0 ; i < str.length() ; i++) {
				// 다음 글자에 따라서 stack에 저장을 할지, stack에서 뽑아서 검사해서 결과를 볼지 정함
				char c = str.charAt(i);
				if ( c == '(' || c == '{' || c == '[') {
					stack.push(c);
				} else if (c == ')' || c == '}' || c == ']') {
					if ( stack.isEmpty()) {
						isBalanced = false;
						break;
					} else {
						char top = stack.pop();
						if ((c == ')' && top != '(') || 
							(c == '}' && top != '{') || 
							(c == ']') && top != '[') {
							isBalanced = false;
							break;
						}
					}
				}
			}
			// 괄호의 수가 맞지 않으면 남아있기 때문에 확인해줌
			if (!stack.isEmpty()) {
				isBalanced = false;
			}
			
			if (isBalanced) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
		}
	}
}
