package ACT_10;
import java.util.*;
public class ACT_10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		for(int i=21;i<=(int)Math.pow(2,21);i++)
		{
			int sqroot=(int)Math.sqrt(i);
			if((sqroot*sqroot==i)&&(i%21==0&&i%36==0&&i%66==0))
			{
				System.out.println("The number is:");
				System.out.println(i);
				break;
			}
		}

	}
}
