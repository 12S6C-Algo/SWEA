package SWEA;

import java.io.*;

public class N1989_초심자의회문검사 {
	public static void main(String args[]) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		loof: for (int t = 1; t <= n; t++) {
			System.out.print("#" + t + " ");
			String input = bf.readLine();
			for (int i = 0; i < input.length() / 2; i++) {
				if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
					System.out.println(0);
					continue loof;
				}
			}
			System.out.println(1);
		}
	}
}

// bufferedReader
//import java.io.*;
//
//public class N1989_초심자의회문검사 {
//	public static void main(String args[]) throws Exception {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(bf.readLine());
//		
//		int result = 0;
//
//		roof: for (int time = 0; time < n; time++) {
//			String input = bf.readLine();
//			int wordLength = input.length();
//			String[] inputs = input.split("");
//
//			for (int index = 0; index < wordLength / 2; index++) {
//				if (!(inputs[index].equals(inputs[wordLength - index - 1]))) {
//					System.out.println("#" + (time + 1) + " " + result);
//					continue roof;
//				}
//			}
//			System.out.println("#" + (time + 1) + " 1");
//		}
//	}
//}

// 스캐너
//import java.util.Scanner;
//
//public class N1989_초심자의회문검사 {
//	public static void main(String args[]) throws Exception {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		sc.nextLine();
//		int result = 0;
//
//		roof: for (int time = 0; time < n; time++) {
//			String input = sc.nextLine();
//			int wordLength = input.length();
//			String[] inputs = input.split("");
//
//			for (int index = 0; index < wordLength / 2; index++) {
//				if (!(inputs[index].equals(inputs[wordLength - index - 1]))) {
//					System.out.println("#" + (time + 1) + " " + result);
//					continue roof;
//				}
//			}
//			System.out.println("#" + (time + 1) + " 1");
//		}
//	}
//}
