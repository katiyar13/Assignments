import java.util.*;

/**
 * 
 */

/**
 * @author askatiya
 *
 */
public class Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		n=sc.nextInt();
		int temp=n;
		while(temp>0)
		{
		int a=temp%10;
		temp=temp/10;
		sum+=(a*a*a);
		}
		if(sum==n)
		{
			System.out.println(n+" is Armstrong no");
		}
		else
		System.out.println("Not Armstrong no");
	}

}
