package solution8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class s1 {
private String name,comp,desg;

protected s1(String name, String comp, String desg) {
	super();
	this.name = name;
	this.comp = comp;
	this.desg = desg;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getComp() {
	return comp;
}
public void setComp(String comp) {
	this.comp = comp;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public void show() {
	System.out.println("Person info:");
	System.out.println(name+" "+comp+" "+desg);
}
public void inital() {
	System.out.println("Init of info:");
}
public void destroy() {
	System.out.println("destroy of info:");
}

}
