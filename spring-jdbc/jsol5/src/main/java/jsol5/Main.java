package jsol5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("NewFile.xml");
		EmployeeDAO e=(EmployeeDAO) context.getBean("employeeDAO");
		EmployeeDetail emp=e.findbyEmpId(8324);
		System.out.println("employee: "+emp);
	}

}
