import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class clienthash {
	public static void main(String args[]) {
		employee e1=new employee(123,"Rishi");
		employee e2=new employee(435,"Vishnu");
		employee e3=new employee(241,"Murli");
		employee e4=new employee(146,"Sohan");
		company c1=new company("abc");
		company c2=new company("xyz");
		Hashtable<employee,company> map=new Hashtable<>();
		map.put(e1,c1);
		map.put(e2,c2);
		map.put(e3,c1);
		map.put(e4,c2);
		System.out.println("Size of hashtable="+map.size());
		Set<Entry<employee,company>> ent=map.entrySet();
		//System.out.println(ent);
		java.util.Iterator<Entry<employee, company>> iterator=ent.iterator();
		while(iterator.hasNext()) {
			Map.Entry<employee, company> e=(Map.Entry<employee, company>)iterator.next();
			employee em=e.getKey();
			company co=e.getValue();
			System.out.println(em);
			System.out.println(co);
		}
	}
}
