package solution2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	
	private static List<Question> ansList;
	private static ApplicationContext context;
    private static Map<String,Question> ansmap;
    private static Set<Question> ansset;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("NewFile.xml");
        Link ans= (Link) context.getBean("List",Link.class);
        ansList =ans.getQlist();
        ansList.forEach(System.out::println);
        System.out.println();
        ans= (Link) context.getBean("set",Link.class);
        ansset=ans.getQset();
        ansset.forEach(System.out::println);
        System.out.println();
        ans= (Link) context.getBean("map",Link.class);
        ansmap=ans.getQmap();
        Iterator it=ansmap.entrySet().iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}

}
