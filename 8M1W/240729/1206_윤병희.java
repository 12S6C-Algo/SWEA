import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 
        for (int T = 0; T < 10; T++) {
            int length = Integer.parseInt(bf.readLine());
            String[] input = bf.readLine().split(" ");
            int[] inputs = new int[length];
             
            for (int index = 2; index < length - 2; index++) {
                inputs[index] = Integer.parseInt(input[index]);
            }
             
            int result = 0;
             
            int[] location = {-2, -1, 1, 2};
            loof: for (int index = 2; index < length - 2; index++) {
                int min = 1001;
                 
                for (int j : location) {
                    if (inputs[index + j] < inputs[index]) {
                        if (min > inputs[index] - inputs[index + j]) {
                            min = inputs[index] - inputs[index + j];
                        }
                    } else {
                        continue loof;
                    }
                }
                result += min;
            }
            System.out.println("#" + (T+1) + " " + result);
        }
        bf.close();
    }
}
