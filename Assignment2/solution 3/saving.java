
public class saving {
	int amt=0,sum=0;

	public int totalAmt() {
		return sum;
	}

	public void addAmt(int amt) {
		this.amt = amt;
		sum+=amt;
	}
}
