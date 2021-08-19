package ACT_11;
import java.util.*;
public class ACT_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		int h1=6;
		int w1=32;
		int h2=5;
		int w2=40;
		float onework=(w1/h1)+(w2/h2);
		float work=110/(onework);
		System.out.println("The time taken by both to complete 110 pages is: "+work+" hours");

	}
}
