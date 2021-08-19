package ACT_7;
import java.util.*;
public class ACT_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter speed of the train:");
		int s=sc.nextInt(); 
		System.out.println("Enter the time taken to cross the pole:"); 
		int time=sc.nextInt(); 
		s=s*1000;
		float speed=(float)s/(float)3600; 
		float distance =speed*time;  
		System.out.println("Length of the train is:");
		System.out.println(distance);
		
		
      
	}
}
