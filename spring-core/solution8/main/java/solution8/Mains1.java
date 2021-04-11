package solution8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mains1 {
	private static AbstractApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("NewFile.xml");
		applicationContext.registerShutdownHook();
         s1 dd= (s1) applicationContext.getBean("demo1");
          dd.show();
}
}
