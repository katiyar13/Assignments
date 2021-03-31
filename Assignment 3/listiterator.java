import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<>();
		a.add(12);
		a.add(91);
		a.add(33);
		a.add(52);
		a.add(21);
		show(a);
	}
	private static void show(List<Integer> a) {
		ListIterator<Integer> l=a.listIterator(a.size());
		System.out.println("Backward array:");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
	 }
	}
}
