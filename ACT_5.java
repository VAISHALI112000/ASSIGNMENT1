package ACT_5;
import java.util.*;
public class ACT_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter n:");
		int n=sc.nextInt();  
		int arr[]=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		} 
		double sum=0.0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}  
		double average=sum/n;  
		System.out.println("The average of the numbers are:");
		System.out.println(average);

	}
}
