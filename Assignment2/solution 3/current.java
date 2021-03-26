
public class current {
	int credit=0,sum=0;

	public int totalAmt() {
		return sum;
	}

	public void amtCredit(int credit) {
		this.credit = credit;
		sum+=credit;
	}
}