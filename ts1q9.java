/*
Implement a Queue Using an Array 
Support Q operations: 'enqueue x', 'dequeue' (print removed value or -1 if empty), 'front' (print front or -1).
Input: First line Q. Next Q lines: operations.
*/
import java.util.*;
public class ts1q9{
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int q=sc.nextInt();
        sc.nextLine();
        int[] queue=new int[100000];
        int front=0, rear=0;
        while (q-->0) {   
            String op = sc.next();
            if(op.equals("enqueue")) {
                int x = sc.nextInt();
                queue[rear++] = x;
            }else if (op.equals("dequeue")) {
                if (front == rear)
                    System.out.println(-1);
                else
                    System.out.println(queue[front++]);
            }
            else if (op.equals("front")) {
                if (front == rear)
                    System.out.println(-1);
                else
                    System.out.println(queue[front]);
            }
        }
    }
}