package Baekjoon;

import java.io.*;
import java.util.Stack;

/*
 * https://www.acmicpc.net/problem/23284
 */
public class N4949_균형잡힌세상 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		loop: while (true) {
			String input = br.readLine();
			if (input.charAt(0) == '.') {
				break;
			}
			
			Stack<Character> stack = new Stack<Character>();
			
			for (int i = 0; i < input.length() - 1; i++) {
				char c = input.charAt(i);
				if (c == '[' || c == '(') {
					stack.add(c);
				} else if (c == ')') {
					if (!stack.empty() && stack.peek() == '(') {
						stack.pop();
					} else {
						System.out.println("no");
						continue loop;
					}
				} else if (c == ']') {
					if (!stack.empty() && stack.peek() == '[') {
						stack.pop();
					} else {
						System.out.println("no");
						continue loop;
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		br.close();
	}
}
