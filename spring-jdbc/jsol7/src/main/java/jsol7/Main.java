package jsol7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("NewFile.xml");
		EmployeeDAO ed=(EmployeeDAO) context.getBean("employeeDao");
		int count=ed.findtotalEmployee();
		System.out.println("count:"+count);
	}

}
