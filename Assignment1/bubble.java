import java.util.ArrayList;
import java.util.Scanner;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] b=new int[15];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		bubbleSort(b);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
	static void bubbleSort(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<(a.length-i);j++)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}

}
