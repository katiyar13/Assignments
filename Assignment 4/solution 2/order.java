
public class order {
	
	int op;
	String os;
	
	public order(int op, String os) {
		super();
		this.op = op;
		this.os = os;
	}

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String toString() {
        return "Orders:" +
                "\norderPrice=" + op +"\norderStatus=" + os+"\n";
}
}