/*
Palindrome Check Using a Deque Deque Easy
Using a double-ended queue, check whether a given string is a palindrome. Compare characters from both ends.
*/
import java.util.*;
public class ts1q11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Deque<Character> dq=new LinkedList<>();
		for(int i=0;i<s.length();i++) {
			dq.addLast(s.charAt(i));
        }
		boolean palindrome=true;
		while(dq.size()>1){
			if(dq.removeFirst()!=dq.removeLast()){
				palindrome=false;
				break;
			}
		}
		if(palindrome)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}