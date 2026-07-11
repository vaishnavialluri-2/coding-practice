/*Bubble Sort with Swap Count Sorting Algorithms Easy
Implement Bubble Sort. Print the sorted array and the total number of swaps performed
*/
import java.util.*;
public class ts1q5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0; //for swaps
        for (int  i=0;i<n-1;i++) {
            for(int j=0;j <n-i-1;j++){
                if(arr[j] >arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        for(int i=0;i<n;i++){ 
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(count);    
    }
}