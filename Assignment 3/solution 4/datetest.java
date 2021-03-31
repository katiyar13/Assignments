import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class datetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<date,employee> tm=new HashMap<>();
		date d1=new date(05, 04, 1989);
		date d2=new date(18, 04, 1997);
		date d3=new date(29, 05, 1989);
		employee e1=new employee("mohan");
		employee e2=new employee("suman");
		employee e3=new employee("riya");
		tm.put(d1,e1);
		tm.put(d2,e2);
		tm.put(d3,e3);
		TreeMap<date,employee> t =  new TreeMap<>(tm);
        Iterator I = t.entrySet().iterator();
        date C = new date(0,0,0);
        while(I.hasNext())
        {
            Map.Entry M = (Map.Entry) I.next();
            date D = (date) M.getKey();
            employee E = (employee) M.getValue();
            System.out.println(D.toString());
            try {
                int i = D.GetDOB(C);
            }
            catch (InvalidDOBException e)
            {
                e.printStackTrace();
            }
            C=D;
	}
}
}