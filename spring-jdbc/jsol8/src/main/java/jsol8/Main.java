package jsol8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("NewFile.xml");
EmployeeDAO ed=(EmployeeDAO) context.getBean("employeeDAO");
EmployeeDetail e=new EmployeeDetail(3135,"Georgia Garraway",43,"PHP Developer",763,"Jack Matthews");
ed.insert(e);
System.out.println("Inserted the data");
	}

}
