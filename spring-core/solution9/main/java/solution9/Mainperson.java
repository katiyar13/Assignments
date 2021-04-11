package solution9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainperson {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("NewFile.xml");
		personinfo person = (personinfo) applicationContext.getBean("person");
        person.display();;
        applicationContext.registerShutdownHook();
	}
}
