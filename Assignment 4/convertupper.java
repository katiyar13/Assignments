import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class convertupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lt=Arrays.asList("hello","team","good","morning");
		System.out.println(lt);
		UnaryOperator<String> op=o->o.toUpperCase();
		lt.replaceAll(op);
		System.out.println(lt);
	}

}
