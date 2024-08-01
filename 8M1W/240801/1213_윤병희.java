package SWEA;

import java.io.*;

public class N1213_String {
	public static void main(String args[]) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		for (int t = 0; t < 10; t++) {
			int test = Integer.parseInt(bf.readLine());
			System.out.print("#" + test + " ");
			String p = bf.readLine();
			String s = bf.readLine();
			
			int result = 0;
			loof: for (int i = 0; i < s.length() - p.length() + 1; i++) {
				for (int j = 0; j < p.length(); j++) {
					if (!(s.charAt(i + j) == p.charAt(j))) { 
						continue loof;
					}
				}
				result++;
			}
			System.out.println(result);
		}
	}
}
