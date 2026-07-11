import java.util.*;
public class ts1q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first=0,last=n-1;
        while(first < last ){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}