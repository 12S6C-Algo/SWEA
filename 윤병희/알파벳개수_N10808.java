import java.io.*;
import java.util.Scanner;

public class N10808_알파벳개수 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] result = new int[26];

		for (int i = 0; i < input.length(); i++) {
			result[(int) input.charAt(i) - 97] += 1;
		}

		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + " ");
	}
}
