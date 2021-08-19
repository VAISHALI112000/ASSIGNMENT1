package ACT_13;
import java.util.*;
public class ACT_13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		Scanner sc=new Scanner(System.in);
		int length,breadth,diff=23,perimeter=206,area; 
		int s=perimeter/2;
		length=(s+diff)/2;
		breadth=length-diff;
		area=length*breadth; 
		System.out.println("The area is:");
		System.out.println(area);
		

	}
}
