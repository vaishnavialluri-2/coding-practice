/*
Classic Binary Search Binary Search Easy
Given a sorted (ascending) array and a key, return its 0-based index, or -1 if absent.
*/
import java.util.*;
public class ts1q7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int low=0,high=n-1;
        int ans=-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid] ==key){
                ans=mid;
                break;
            } else if(arr[mid] < key){
                low=mid+1;
            } else high=mid-1;
        }
    System.out.println(ans);
    }
}