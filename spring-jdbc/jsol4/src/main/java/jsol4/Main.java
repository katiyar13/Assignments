package jsol4;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    context = new ClassPathXmlApplicationContext("NewFile.xml");
		EmployeeDAO e=(EmployeeDAO) context.getBean("employeeDAO");
		List<EmployeeDetail> em=e.findall();
		System.out.println("EmployeeList:"+ em);
		System.out.print("Size"+em.size());
	}

}
