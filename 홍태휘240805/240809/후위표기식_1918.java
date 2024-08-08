import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String postfix = "";
		Stack<Character> stack = new Stack<>();
		
		
		
		for ( int i = 0 ; i < str.length() ; i++) {
			char c = str.charAt(i);
			if( c >= 'A' && c <= 'Z') {
				postfix += c;
			} else if ( c == '(') {
				stack.push(c);
			} else if ( c == ')') {
				char popItem = stack.pop();
				while ( popItem != '(') {
					postfix += popItem;
					popItem = stack.pop();
				}
			} else {
				
				while ( !stack.isEmpty() && stack.peek() != '(' && map.containsKey(stack.peek()) && map.get(stack.peek()) >= map.get(c)) {
					
					char popItem = stack.pop();
					postfix += popItem;
				}
				stack.push(c);
			}
			
		}
		while (!stack.isEmpty()) {
			postfix += stack.pop();
		}
		
		System.out.println(postfix);
		
	}
	static Map<Character, Integer> map = new HashMap<>();
	
	static {
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
		
	}
}
