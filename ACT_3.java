package ACT_3;
import java.util.*;
public class ACT_3 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the level of pyramid : ");
		int n=sc.nextInt();
		int p=1,s=n-1,num=1;
		while(p<=n){
			for(int i=1;i<=s;i++)
				System.out.print(" ");
			for(int i=1;i<=p;i++){
				if(num>9){
					num=num%9-1;
				}
				System.out.print(num);num++;
			}	
			int rev=num-2;
			for(int i=1;i<p;i++){
				if(rev<0){
					rev=9;
				}
				System.out.print(rev);rev--;
			}
			p++;System.out.print("\n");s--;
		}
	}

	

}
