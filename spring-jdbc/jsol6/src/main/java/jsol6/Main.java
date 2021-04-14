package jsol6;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("NewFile.xml");
EmployeeDAO ed=(EmployeeDAO) context.getBean("employeeDAO");
List<EmployeeDetail> emp=ed.findall();
System.out.print("employee:"+emp);
System.out.println("size:"+emp.size());
	}

}
