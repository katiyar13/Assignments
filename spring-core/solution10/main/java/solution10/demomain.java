package solution10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class demomain {

		private static ApplicationContext applicationContext;
		public static void main(String[] args) {
			applicationContext = new ClassPathXmlApplicationContext("NewFile.xml");

	         demo dd= (demo) applicationContext.getBean("demo1");
	        System.out.println(dd.toString());
	}

}
