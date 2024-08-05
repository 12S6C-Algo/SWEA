import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
         
        int tc = sc.nextInt();
         
        for(int i = 1; i <= tc; i++) {
            int k = sc.nextInt();
            int[] money = new int[k];
            int[] sum = new int[tc + 1];
             
            for(int j = 0; j < k; j++) {
                money[j] = sc.nextInt();
                 
                if(money[j] == 0) {
                    for(int a = j - 1; a >= 0; a--) {
                        if(money[a] == 0)
                            continue;
                        else if(money[a] != 0)
                            money[a] = 0;
                            break;
                    }
                }
                 
            }   
            for(int a = 0; a < k; a++)
                sum[i] += money[a];
                System.out.println("#" + i + " " + sum[i]);
        }
         
    }
}
