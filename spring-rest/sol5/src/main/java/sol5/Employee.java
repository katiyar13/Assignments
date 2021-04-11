package sol5;

public class Employee {
 int id;
 String name;
 String department;
 String designation;
 int salary;
 static int auto=1451;

public Employee(String name, String department, String designation, int salary) {
	// TODO Auto-generated constructor stub
	this.id = ++auto;
	this.name = name;
	this.department = department;
	this.designation = designation;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
 
}
