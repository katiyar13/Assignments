import java.util.Scanner;

/**
 * 
 */

/**
 * @author askatiya
 *
 */
public class Tax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inc;
		double tax;
		Scanner sc=new Scanner(System.in);
		inc=sc.nextInt();
		if(inc>0 && inc<180000)
		{
			tax=0;
			System.out.println(tax);
		}
		else
			if(inc>181001 && inc<300000)
		{
			tax=(0.1*inc);
			System.out.println(tax);
		}
		else
			if(inc>300001 && inc<500000)
		{
			tax=(int) (0.2*inc);
			System.out.println(tax);
		}
			else
				if(inc>500001 && inc<1000000)
		{
			tax=(int) (0.3*inc);
			System.out.println(tax);
		}
	}

}
