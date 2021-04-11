package sol5;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.el.stream.Optional;

@RestController
public class Controller {
@Autowired
	service ser;
@PostMapping(path ="/addEmployee")
public void addEmp(@RequestBody Employee employee) {
    ser.addEmp(employee);
}

@GetMapping(path = "/searchEmployee/{empId}")
public java.util.Optional<Employee> search(@PathVariable int Id) {

    return ser.search(Id);
}

@DeleteMapping("/deleteEmployee/{empId}")
public void deleteEmployee(@PathVariable int Id) {
    ser.delete(Id);
}

@GetMapping("/findAllEmployee")
public ArrayList<Employee> findAllEmployee() {
    return ser.findall();
}

@PostMapping("/updateEmployee")
public void updateEmployee(@RequestBody Employee employee) {
    ser.update(employee);
}


}
