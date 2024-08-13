package Baekjoon;

import java.io.*;
import java.util.*;

public class N1158_요세푸스문제 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}
		String result = "<";
		while(!queue.isEmpty()) {
			for (int i = 1; i < K; i++) {
				queue.add(queue.poll());
			}
			result += queue.poll() + ", ";
		}
		
		System.out.println(result.substring(0, result.length()-2) + ">");
	}
}