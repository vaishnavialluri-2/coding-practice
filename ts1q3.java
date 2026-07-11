//Given an array of N integers, print the number of distinct elements.
import java.util.*;
public class ts1q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        System.out.println(set.size());
    }
}