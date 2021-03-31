import java.util.ArrayList;
import java.util.List;

public class ordertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<order> ar=new ArrayList<>();
		order o1=new order(15000, "Accepted");
		order o2=new order(20000, "Accepted");
		order o3=new order(1000, "Completed");
		ar.add(o1);
		ar.add(o2);
		ar.add(o3);
		//System.out.println(ar);
		checking ck=(order od)->od.getOp() > 10000;
			visible(ar,ck);
		}
		public static void visible(List<order> l,checking ck) {
			for(order or:l) {
				if(ck.PriceCheck(or))
	            {
	                System.out.println(or);
	            }
			}

}
}
@FunctionalInterface
interface checking
{
    Boolean PriceCheck(order or);
}
