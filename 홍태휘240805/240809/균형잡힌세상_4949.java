import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str = br.readLine();
			
			if ( str.equals(".")) 
				break;
			
			boolean isBalanced = true;
			Stack<Character> stack = new Stack<>();
			
			for ( int i = 0 ; i < str.length() ; i++) {
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
