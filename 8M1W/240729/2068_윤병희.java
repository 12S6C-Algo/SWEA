import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int data = 0;
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            String[] input = bf.readLine().split(" ");;
            max = 0;
            for (int j = 0; j < 10; j++) {
                data = Integer.parseInt(input[j]);
                if (max < data) {
                    max = data;
                }
            }
             
            System.out.println("#" + (i+1) + " " + max);
        }
    }
}
