import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Threadclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lt=Arrays.asList("hello","team","good","morning");
		System.out.println(lt);
		Consumer<List<String>> th=s->new Thread(()->s.forEach(System.out::println)).run();
		th.accept(lt);
	}

}
