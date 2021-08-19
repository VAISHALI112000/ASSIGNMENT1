package ACT_8;
import java.util.*;
public class ACT_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the train:");
		int l=sc.nextInt();
		System.out.println("Enter the running speed of the man:");
		int s1=sc.nextInt();
		System.out.println("Time taken by the train to cross the man:");
		int t=sc.nextInt(); 
		float speed=(l/t); 
		float s2=speed*(float)3.6;  
		float s=s1+s2;   
		System.out.println("Speed of the train is:");
		System.out.println(s);
		
		

	}
}
