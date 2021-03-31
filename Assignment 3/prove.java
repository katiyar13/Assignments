import java.util.HashSet;
import java.util.LinkedHashSet;

public class prove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h=new HashSet<>();
		LinkedHashSet<Integer> lh=new LinkedHashSet<>();
		h.add(3);
		h.add(1);
		h.add(8);
		h.add(0);
		System.out.println(h);
		lh.add(6);
		lh.add(4);
		lh.add(3);
		System.out.println(lh);
	}

}
