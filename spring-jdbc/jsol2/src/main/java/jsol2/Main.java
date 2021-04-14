package jsol2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("NewFile.xml");
		EmployeeDAO e=(EmployeeDAO) context.getBean("employeeDAO");
		EmployeeDetail em=new EmployeeDetail(3135,"Brian Osborne",34,"Bussiness Development Manager",343,"Winifred Griffith");
		e.insert(em);
		System.out.println("Record inserted");
	}

}
