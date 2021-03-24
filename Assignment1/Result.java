import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>60 && b>60 && c>60)
		{
			System.out.println("Result is passed");
		}
		else {
			if(a>60 && b>60 || b>60 && c>60 || a>60 && c>60)
			{
				System.out.println("Promoted");
			}
			else{
				if(a>60 || b>60 ||c>60 || a<60 &&b<60 &&c<60)
				{
					System.out.println("Failed");
				}
			}
		}
	}

}
