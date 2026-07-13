/*
Valid Parentheses Stack Easy
Given a string of brackets '()[]{}', determine whether it is balanced (every opening bracket has a matching closing
bracket of the same type in correct order).
*/
import java.util.*;
public class ts1q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        boolean valid=true;
        for (char c:s.toCharArray()) {
            if (c=='(' || c=='{' || c=='[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    valid = false;
                    break;
                }
                char top = st.pop();
                if ((c == ')' && top != '(')||(c == '}' && top != '{')||(c == ']' && top != '[')) {
                    valid = false;
                    break;
                }
            }
        }
        if(valid && st.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}