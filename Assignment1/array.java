import java.util.Scanner;

/**
 * 
 */

/**
 * @author askatiya
 *
 */
public class array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=19;
		int[] a=new int[15];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("Present at"+(i+1));
				break;
			}
		}
		
	}

}
