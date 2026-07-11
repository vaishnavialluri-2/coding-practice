/*
Sum of Digits (Recursive) 
Given a non-negative integer N, compute the sum of its digits using recursion (no loops).
*/
import java.util.*;
public class ts1q6{
    static long sum(long n){
        if (n==0) return 0;
        return (n%10)+sum(n/10); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(sum(n));
    }
}