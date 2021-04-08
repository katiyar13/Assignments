import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class fruitmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<fruit> fa=new ArrayList<>();
		fruit fa1=new fruit("mango", 70, 50, "yellow");
		fruit fa2=new fruit("apple", 150, 40, "red");
		fruit fa3=new fruit("orange", 90, 60, "orange");
		fruit fa4=new fruit("watermelon", 35, 75, "green");
		fa.add(fa4);fa.add(fa3);fa.add(fa1);fa.add(fa2);
		 List<fruit> l =  fa.stream().filter(p -> p.getCalories() < 100)
                 .sorted((fruit o1, fruit o2) -> o1.getCalories() > o2.getCalories() ? 1 : -1)
                 .collect(Collectors.toList());
		 l.forEach(System.out::println);
		 System.out.println("\n");
		 
		 fa.stream().sorted(Comparator.comparing(fruit::getColor))
		            .forEach(p -> System.out.println(p.getName()));
		 System.out.println("\n");
		 fa.stream()
         .filter(p -> p.getColor().equalsIgnoreCase("Red"))
         .sorted((fruit o1, fruit o2) -> o1.getPrice() < o2.getPrice() ? 1 : -1)
         .forEach(System.out::println);

	}

}
