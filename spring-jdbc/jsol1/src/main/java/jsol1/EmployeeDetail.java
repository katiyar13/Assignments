package jsol1;

public class EmployeeDetail {
int emp_id;
String name;
int age;
String designation;
int dept_code;
String manager;
public EmployeeDetail(int emp_id, String name, int age, String designation, int dept_code, String manager) {
	super();
	this.emp_id = emp_id;
	this.name = name;
	this.age = age;
	this.designation = designation;
	this.dept_code = dept_code;
	this.manager = manager;
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
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
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getDept_code() {
	return dept_code;
}
public void setDept_code(int dept_code) {
	this.dept_code = dept_code;
}
public String getManager() {
	return manager;
}
public void setManager(String manager) {
	this.manager = manager;
}
}
