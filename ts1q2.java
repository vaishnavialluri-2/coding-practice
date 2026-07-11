//Given N integers where every value lies in [0, 9], print how many times each value 0..9 appears.

import java.util.*;
public class ts1q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] freq = new int[10]; 
        for(int i=0;i<n;i++) {
            int num=sc.nextInt();
            freq[num]++;
        }
        for (int i=0;i<10;i++ ) {
            System.out.println(i + " " + freq[i]);
        }
    }
}