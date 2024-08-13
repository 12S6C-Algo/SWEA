package Baekjoon;

import java.io.*;
import java.util.*;

public class N13335_트럭 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int W = Integer.parseInt(input[1]);
		int L = Integer.parseInt(input[2]);
		
		int t = 0;
		int max = 0;
		
		Queue<Integer> bridgeQueue = new LinkedList<>();
		for (int i = 0; i < W; i++) {
			bridgeQueue.add(0);
		}
		
		Queue<Integer> truckQueue = new LinkedList<>();
		String[] inputString = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			truckQueue.add(Integer.parseInt(inputString[i]));
		}
		
		while (!(truckQueue.isEmpty() && max == 0)) {
			max -= bridgeQueue.poll();
			if (!truckQueue.isEmpty() && max + truckQueue.peek() <= L) {
				int nowTruck = truckQueue.poll();
				bridgeQueue.add(nowTruck);
				max += nowTruck;
			} else {
				bridgeQueue.add(0);
			}
			
			t++;
		}
		System.out.println(t);
	}
}