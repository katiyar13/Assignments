import java.util.Scanner;
import java.util.TreeMap;

public class Tree {
	public static void main(String[] args) {
		TreeMap<person,person> a = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
	    while(true)
	    {
	        System.out.print("weight ");
	        int weight = sc.nextInt();
	        System.out.print("height ");
	        int height = sc.nextInt();
	        System.out.print("Name ");
	        sc.nextLine();
	        String name = sc.nextLine();
	        person P = new person(weight,height,name);
	        a.put(P,P);
	        System.out.println("Do u want to enter more Person details : ");
	        System.out.print("Say Yes or No :  ");
	        String chk = sc.next();
	        if(chk.equalsIgnoreCase("No"))
	        {
	            break;
	        }
	    }
		a.forEach((k,v)->{
			System.out.println(k.getName()+" "+v.getWeight()+" "+v.getHeight());
		});
	}
	}


