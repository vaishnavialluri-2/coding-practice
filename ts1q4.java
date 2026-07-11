//Two Sum (Return Indices) Maps Easy
/* Given an array and a target T, return the 1-based indices of two elements that add up to T. Assume exactly one
solution exists.
*/
import java.util.*;
public class ts1q4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int i=1;i<n;i++) {
            int curr=sc.nextInt();
            int req=t-curr;
            if (map.containsKey(req)) {
                System.out.println(map.get(req) + " " + i);
            }
            map.put(curr, i);
        }
    }
}