import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class firstletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lt=Arrays.asList("hello","team","good","morning");
		System.out.println(lt);
		StringBuilder str=new StringBuilder();
        Consumer<String> rs = r -> str.append(r.charAt(0));
		
		for(String st: lt) {
			rs.accept(st);
		}
		System.out.println(str);
	}

}
