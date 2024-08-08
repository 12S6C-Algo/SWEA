package 알고망고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;
import java.util.StringTokenizer;

public class 후위표기식8월9일 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();	//스트링 빌더에 최종결과(후위표기식)을 담음

        char[] arr = br.readLine().toCharArray(); //문자열 --> 문자배열 생성 'A','+''B'

        Stack<Character> stack = new Stack<>();	//LIFO

        
        
        for(int i=0;i<arr.length;i++){
            char c = arr[i];	//배열에 있는 값들을 c라는 문자에 받아준다 
            if(c == '+' || c == '-' || c == '*' || c == '/'){		//c가 연산자라면 
            	//스택이 비어있지 않고, 최근 연산자 우선순위 < 스택에 쌓인 연산자 우선순위
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
                
            } else { 												//피연산자(문자) 일때 
                sb.append(c);
            }


        }

        
        
        while (!stack.isEmpty()){	//스택이 어떤게 남아있다면?
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
