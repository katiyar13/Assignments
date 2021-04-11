package solution5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class examplemain {
	
		private static ApplicationContext applicationContext;
		public static void main(String[] args) {
			applicationContext = new ClassPathXmlApplicationContext("NewFile.xml");

	         example dd=(example) applicationContext.getBean("demo1");
	          dd.show();	
	}

}
