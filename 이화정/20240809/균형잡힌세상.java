import java.util.*;

class 균형잡힌세상 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            
            if (str.equals(".")) {
                break;
            }
            
            Stack<Character> stack = new Stack<>();
            boolean balanced = true;
            
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' || ch == ']') {
                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    } else {
                        char top = stack.pop();
                        if (!isMatchingPair(top, ch)) {
                            balanced = false;
                            break;
                        }
                    }
                }
            }
            
            if (balanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
    
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']');
    }
}
