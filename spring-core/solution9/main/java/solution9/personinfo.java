package solution9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class personinfo implements InitializingBean , DisposableBean{
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
private int age;
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Destroy method");
}
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("property set method");
}
public void display() {
	System.out.println(name+" "+age);
}

}
