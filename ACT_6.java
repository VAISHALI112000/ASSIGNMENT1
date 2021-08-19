package ACT_6;
import java.util.*;
public class ACT_6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the string:");
		String s=sc.nextLine(); 
		String s1=""; 
		int arr[]=new int[128];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			arr[ch]+=1;
			if(arr[ch]==1)
			{
				s1+=ch;
			}
		} 
		System.out.print(s1);
		
	}

}
