package ACT_1;
import java.util.*;
public class ACT_1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter n25:");
		int n=sc.nextInt();
		int arr[]=new int[n];  
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}  
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}  
		System.out.println("The maximum element is:");
		System.out.println(max);
		
	}
}
