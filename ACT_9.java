package ACT_9;
import java.util.*;
public class ACT_9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the percentage of total valid votes:");
		int v1=sc.nextInt();
		System.out.println("Enter the percentage of invalid votes:");
		int iv=sc.nextInt(); 
		System.out.println("Enter the total number of votes:"); 
		int total=sc.nextInt(); 
		System.out.println("The valid votes are:");
		float v=(float)(100-iv)/(float)100*(total);
		float v2=(float)(100-v1)/(float)100*(v); 
		System.out.println("The total number of valid votes the other person got is:");
		System.out.println(v2);
		
		
		

	}

}
