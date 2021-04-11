package solution10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class demo implements ApplicationContextAware,BeanNameAware{
	String name;
	int id,number;
	private ApplicationContext applicationContext =null;
	
	
	public demo(String name, int id, int number) {
		super();
		this.name = name;
		this.id = id;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String toString() {
		return (name+" "+id+" "+number);
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext=applicationContext;
	}
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("Bean name :"+beanName);
	}
}
