package sol5;

import java.util.ArrayList;

import com.sun.el.stream.Optional;

public class service {
Repository repo;
ArrayList<Employee> ae=new ArrayList<Employee>();
public void addEmp(Employee emp) {
	repo.save(emp);
}
public java.util.Optional<Employee> search(int id){
	return repo.findById(id);
}
public void delete(int id) {
	repo.deleteById(id);
}
public void update(Employee emp) {
	repo.save(emp);
}
public ArrayList<Employee> findall(){
	repo.findAll().forEach(ae::add);
	return ae;
}
}
