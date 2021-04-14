package jsol1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("NewFile.xml");
		EmployeeDAO e=(EmployeeDAO) context.getBean("employeeDAO");
		EmployeeDetail em=new EmployeeDetail(3333,"Joey Wright",45,"Bussiness Development Manager",834,"Michael Mcadam");
		e.insert(em);
		System.out.println("Record inserted");
	}

}
