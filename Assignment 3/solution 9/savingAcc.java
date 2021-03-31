
public class savingAcc {
int accbal;
int accid;
String holdername;
boolean issalacc;
public int getAccbal() {
	return accbal;
}
public void setAccbal(int accbal) {
	this.accbal = accbal;
}
public int getAccid() {
	return accid;
}
public void setAccid(int accid) {
	this.accid = accid;
}
public String getHoldername() {
	return holdername;
}
public void setHoldername(String holdername) {
	this.holdername = holdername;
}
public boolean isIssalacc() {
	return issalacc;
}
public void setIssalacc(boolean issalacc) {
	this.issalacc = issalacc;
}
void deposit(int amt) {
	accbal+=amt;
}
void withdraw(int amt) {
	if(amt>accbal)
		System.out.println("Do not have enough balance");
	else
		accbal-=amt;
}
public savingAcc(int accbal, int accid, String holdername, boolean issalacc) {
	this.accbal = accbal;
	this.accid = accid;
	this.holdername = holdername;
	this.issalacc = issalacc;
}
@Override 
public String toString() {
    return "Account:" +
            "acc_balance=" + accbal +
            "\nHolderName=" +holdername +
            "\nisSalaryAccount=" + issalacc;
}
}