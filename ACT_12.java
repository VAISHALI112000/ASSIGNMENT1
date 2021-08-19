package ACT_12;
import java.util.*;
public class ACT_12 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<=(int)n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
		} 
		if(flag==0)
		{
			System.out.println("The given number is a prime number");
		} 
		else
		{
			System.out.println("The given number is not a prime number");
		}
		
	}
}
