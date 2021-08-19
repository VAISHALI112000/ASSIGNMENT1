package ACT_14;
import java.util.Scanner;
public class ACT_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in); 
		System.out.println("The first number is:");
		int n1=sc.nextInt();
		System.out.println("The second number is:");
		int n2=sc.nextInt(); 
		System.out.println("The third number is:");
		int n3=sc.nextInt();
		int gcd=ACT_14.findGCD(n1,n2,n3);
		System.out.println("The number is:");
		System.out.println(gcd);
		sc.close();

	} 
	public static int findGCD(int x,int y)
	{
		if(y==0)
		{
			return x;
		} 
		else
		{
			return findGCD(y,x%y);
		}
	} 
	public static int findGCD(int x,int y,int z)
	{
		return findGCD(findGCD(x,y),z);
	}
}
