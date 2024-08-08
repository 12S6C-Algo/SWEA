package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;
import java.util.StringTokenizer;

public class 후위표기식 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] array = br.readLine().toCharArray(); //문자열 --> 문자배열 생성 

        Stack<Character> stack = new Stack<>();	

        for(int i=0;i<array.length;i++){
            char c = array[i];	//배열에 있는 값들을 c라는 문자에 받아준다 
            if(c == '+' || c == '-' || c == '*' || c == '/'){		//c가 연산자라면 
            	//스택이 비어있지 않고 , 아래서 정의한 우선순위에 부합한다면 , 
            	//스택 아래있는것보다 최근에 있는게 우선순위가 더 크다면
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(c)){		
                    sb.append(stack.pop());
                }
                stack.push(c);
            } else if(c == '('){
                stack.push(c);
            } else if(c == ')'){
            	//스택이 비어있지 않고 '('가 다시 나올때까지 스택에 있는 것을 빼서 더한다 
                while (!stack.isEmpty() && stack.peek() != '('){
                    sb.append(stack.pop());
                }
                stack.pop();
            } else {
                sb.append(c);
            }


        }

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());

    }

    
    
    
    public static int priority(char c){		//위에서 사용한 우선순위 정하기
        if(c == '(' || c == ')'){
            return 0;
        } else if(c == '+' || c == '-'){
            return 1;
        } else if(c == '/' || c == '*'){
            return 2;
        }
        return -1;		//사용할 일 없음 
    }
}
