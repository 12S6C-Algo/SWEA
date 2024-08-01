package 실습_240801;

import java.util.Scanner;

class Solution1

{

    public static void main(String args[]) throws Exception

    {

        Scanner sc = new Scanner(System.in);

        int T;

        T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)

        {

            String string = sc.next();

            boolean isPalindrome = true;

            int i = 0;

            int j = string.length() - 1;


            while (i < j) {

                if (string.charAt(i) != string.charAt(j)) {

                    isPalindrome = false;

                    break;

                }

                i++;

                j--;

            }


            if (isPalindrome) {

                System.out.println("#" + test_case + " 1");

            } else {

                System.out.println("#" + test_case + " 0");

            }

        }

    }

}