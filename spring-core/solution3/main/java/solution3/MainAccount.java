package solution3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAccount {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("NewFile.xml");	
		 detail bb= (detail) context.getBean("details");
		 System.out.println(bb.withdraw(2354,10000));
		 System.out.println(bb.getBalance(9800));
	}

}
