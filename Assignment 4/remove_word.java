import java.util.ArrayList;

public class remove_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("Welcome ");
		list.add("to the");
		list.add("code");
		list.add("world");
		list.removeIf(l-> l.length()%2!=0);
		System.out.println("List:"+list);
	}

}
