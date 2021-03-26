
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saving s=new saving();
		current c=new current();
		s.addAmt(10000);
		s.addAmt(10000);
		s.addAmt(10000);
		s.addAmt(10000);
		int a=s.totalAmt();
		c.amtCredit(900);
		c.amtCredit(900);
		c.amtCredit(900);
		c.amtCredit(900);
		int b=c.totalAmt();
		System.out.println("total cash in bank is"+(a-b));
	}

}
