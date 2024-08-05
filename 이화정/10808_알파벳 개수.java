package practice;
import java.util.*;

class backjoon {
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] arr = new int[26]; 
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			arr[(int)(c - 97)] += 1;
			
		}
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
