/*
K Largest Elements Priority Queue 
Given N integers and K, print the K largest elements in descending order.
*/
import java.util.*;
public class ts1q10{
    	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<n;i++){
			pq.add(sc.nextInt());
        }
		for(int i=0;i<k;i++){
			System.out.print(pq.remove()+" ");
        }
	}
}