package APS.Day04;

import java.io.*;

public class 회문1_1215 {
    public static char[][] arr = new char[8][8];
    public static int palindrome(int length, char[][] arr) {
        int cnt = 0;

        for(int i=0; i<8; i++) {

            for(int j=0; j<8-length+1; j++) {
                boolean check1 = true;
                boolean check2 = true;
                for(int k = 0; k<length/2; k++) {
                    if(arr[i][j+k] != arr[i][j+length-1-k]) {
                        check1 = false;
                    }
                    if(arr[j+k][i] != arr[j+length-1-k][i]) {
                        check2 = false;
                    }
                }
                if(check1) cnt++;
                if(check2) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int cases = 1; cases<=10; cases++) {
                int length = Integer.parseInt(reader.readLine());
                for(int row=0; row<8; row++) {
                    arr[row] = reader.readLine().toCharArray();
                }
                writer.append("#"+cases+" "+palindrome(length, arr)+"\n");
            }
            writer.flush();
            writer.close();
            reader.close();

    }

}
