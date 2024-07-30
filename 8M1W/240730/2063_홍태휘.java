import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        int testCase = scanner.nextInt();
         
        //배열을 만듦
        int[] nums = new int[testCase];
        for ( int i = 0 ; i < testCase ; i++) {
            nums[i] = scanner.nextInt();
        }
        // 최대값을 찾아줌
        int k = -1;
        for ( int i = 0 ; i < nums.length ; i++) {
            if ( nums[i] > k) {
                k = nums[i];
            }
        }
        int[] count = new int[k+1];
         
        for ( int i = 0; i < nums.length ; i++) {
            count[nums[i]]++;
        }
        //누적 배열 만듦
        for ( int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
         
        //역방향 순회 하면서 위치 찾기
         
        int[] sortedArr = new int[nums.length];
         
        for ( int i = nums.length - 1 ; i >= 0 ; i--) {
            sortedArr[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }
         
        //중간값 찾기
        int mid = nums.length/2;
         
        System.out.println(sortedArr[mid]);
    }
 
}
