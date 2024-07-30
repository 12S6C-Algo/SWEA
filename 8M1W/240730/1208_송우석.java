package APS.Day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_문제해결_기본_1일차_Flatten {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //10번의 테스트케이스 진행
        for (int i = 0; i < 10; i++) {
            int[] box = new int[100];
            int dumpCount = Integer.parseInt(br.readLine());

            //박스 높이
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 100; j++) {
                box[j] = Integer.parseInt(st.nextToken());
            }

            //평탄화 작업 메서드
            int result = moveBox(box, dumpCount);
            System.out.printf("#%d %d\n", i+1, result);
        }
    }

    static int moveBox(int[] box, int dumpCount) {
        for (int i = 0; i < dumpCount; i++) {
            bubbleSort(box);
            box[0]++;
            box[box.length - 1]--;
        }
        bubbleSort(box);
        int result = box[box.length - 1] - box[0];
        return result;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
