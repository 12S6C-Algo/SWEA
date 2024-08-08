package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class N1918_후위표기식 { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<Character, Integer> map = new HashMap<>();
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
		map.put('(', 0);

		String input = br.readLine();

		Stack<Character> stack = new Stack<>();
		String postfix = "";
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c <= 'Z' && c >= 'A') {
				postfix += c;
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (stack.peek() != '(') {
					postfix += stack.pop();
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && map.get(stack.peek()) >= map.get(c)) {
					postfix += stack.pop();
				}
				stack.push(c);
			}
		}

		while (!stack.isEmpty()) {
			postfix += stack.pop();
		}
		System.out.println(postfix);

		br.close();
	}
}
