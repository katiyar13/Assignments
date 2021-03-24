import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		double r=sc.nextDouble();
		int t=sc.nextInt();
		double si=(p*r*t)/100;
		double ci=p*(Math.pow((1+r/100),t))-p;
		System.out.println("Simple and compound interest is:"+si +" "+ci);

	}

}
