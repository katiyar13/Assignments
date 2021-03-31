import java.util.TreeMap;

public class bankAccList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,savingAcc> ac = new TreeMap<>();
		savingAcc sa1=new savingAcc(50000, 1324,"suraj", false);
		savingAcc sa2=new savingAcc(36000, 2342,"sameera", true);
		savingAcc sa4=new savingAcc(8000, 1172,"reema", false);
		savingAcc sa3=new savingAcc(100000, 7860,"mohan", true);
		ac.put(sa1.accid, sa1);
		ac.put(sa2.accid, sa2);
		ac.put(sa3.accid, sa3);
		ac.put(sa4.accid, sa4);
		ac.forEach((K,V)->{
            System.out.println("Account ID : "+K+" \n"+V.toString());
            System.out.println();
        });
	}

}
