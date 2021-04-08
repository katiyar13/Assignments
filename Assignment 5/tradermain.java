import java.util.ArrayList;
import java.util.Comparator;

public class tradermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<transaction> ta=new ArrayList<>();
		trader t1=new trader("Rohan", "Noida");
		trader t2=new trader("Suman", "Pune");
		trader t3=new trader("Shreya", "Banglore");
		transaction tr1=new transaction(t1, 2002, 17000);
		transaction tr2=new transaction(t2, 2020, 10000);
		transaction tr3=new transaction(t3, 2011
				, 32000);
		ta.add(tr1);ta.add(tr2);ta.add(tr3);
		System.out.println(ta);
		
		ta.stream()
        .filter(p -> p.getYear() == 2011)
        .sorted((transaction o1, transaction o2) -> (o1.getValue() < o2.getValue() ? 1 : -1))
        .forEach(System.out::println);
		
		ta.stream()
        .filter(p -> p.getTr().getCity().equalsIgnoreCase("Pune"))
        .sorted(Comparator.comparing((transaction o) -> o.getTr().getName()))
        .forEach(System.out::println);
	}

}
