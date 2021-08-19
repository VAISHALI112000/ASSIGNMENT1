package ACT_2;
import java.util.*;
public class ACT_2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt(); 
		int arr[]=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		} 
		int max=arr[0];
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i]; 
			}
		}  
		for(int i=0;i<n;i++)
		{
			if(arr[i]==max)
			{
				count++;
			}
		}
		System.out.println("The number of times the maximum element occurs is:");
		System.out.println(count);
		
	}
}
