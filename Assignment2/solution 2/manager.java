
public class manager extends employee{
	public int incentive(int i) {
		return i;
	}
	
	public void totalSal(int x,int y) {
		int sum=0;
		sum=x+y;
		System.out.println("Manager total sal:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manager e=new manager();
		int m=10000;
		int n=e.incentive(4000);
		e.totalSal(m, n);;
	}

}
