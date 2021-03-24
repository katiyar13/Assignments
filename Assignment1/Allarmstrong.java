import java.util.Scanner;

public class Allarmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<999;i++)
		{
			int sum=0;
			int temp=i;
			while(temp>0)
			{
			int a=temp%10;
			temp=temp/10;
			sum+=(a*a*a);
			}
			if(sum==i)
			{
				System.out.println(i+" is Armstrong no");
			}
			
		}
	}

}
