package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class 에디터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int orderNum = Integer.parseInt(br.readLine());
        List<Character> editor = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            editor.add(str.charAt(i));
        }
        int cursor = str.length();

        for (int i = 0; i < orderNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (order.equals("L")) {
                if (cursor > 0) {					
                    cursor--;
                }
            } else if (order.equals("D")) {
                if (cursor < editor.size()) {					
                    cursor++;
                } 
            } else if (order.equals("B")) {
                if (cursor > 0) {
                    editor.remove(cursor - 1);
                    cursor--;
                }
            } else if (order.equals("P")) {
                char tmp = st.nextToken().charAt(0);
                editor.add(cursor, tmp);
                cursor++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char item : editor) {
            sb.append(item);
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
}
