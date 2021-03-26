
public class labour extends employee{
	public int overtime(int i) {
		return i;
	}
	
	public void totalSal(int x,int y) {
		int sum=0;
		sum=x+y;
		System.out.println("Labour total sal:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		labour l=new labour();
		int m=3000;
		int n=l.overtime(1000);
		l.totalSal(m, n);
	}

}
