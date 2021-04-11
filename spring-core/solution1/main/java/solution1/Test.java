package solution1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext applicationContext;
	private static Customer r;
	public static Customer obj(){
		return r;
	}
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("NewFile.xml");

        Customer customer = (Customer) applicationContext.getBean("customer");
        r=customer;
        System.out.println(customer.toString());
	}

}
