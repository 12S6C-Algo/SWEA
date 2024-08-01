import java.util.Scanner;
 
class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        int tmp;
        int mid = N / 2;
         
        for(int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
 
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
         
        System.out.print(nums[mid]);
        }
    }
