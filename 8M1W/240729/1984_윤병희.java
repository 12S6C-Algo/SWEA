import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int max = 0;
        int min = 10001;
        int sum = 0;
        int data = 0;
 
        for (int i = 0; i < T; i++) {
            String[] input = bf.readLine().split(" ");;
            max = Integer.parseInt(input[0]);
            min = Integer.parseInt(input[0]);
            sum = Integer.parseInt(input[0]);
             
            for (int j = 1; j < 10; j++) {
                data = Integer.parseInt(input[j]);
                sum += data;
                if (max < data) {
                    max = data;
                } else if (min > data) {
                    min = data;
                }
            }
             
            sum -= (min + max);
            System.out.println("#" + (i+1) + " " + Math.round(((float)sum/(float)8)));
        }
         
        bf.close();
    }
}
