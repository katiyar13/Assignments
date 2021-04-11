package sol5;

import java.util.ArrayList;

public class EmpList {
ArrayList<Employee> emparr;
public EmpList() {
	emparr=new ArrayList<Employee>();
	Employee e1=new Employee("Rajat", "IT", "Analyst", 25000);
	Employee e2=new Employee("Seema", "NON IT", "HR Manager", 38000);
	Employee e3=new Employee("Mohan", "NON IT", "SalesManager", 40000);
	Employee e4=new Employee("Kiran", "IT", "Database Engg.", 32000);
	emparr.add(e1);emparr.add(e2);emparr.add(e3);emparr.add(e4);
}
public ArrayList<Employee> getEmparr() {
	return emparr;
}
public void setEmparr(ArrayList<Employee> emparr) {
	this.emparr = emparr;
}

}
