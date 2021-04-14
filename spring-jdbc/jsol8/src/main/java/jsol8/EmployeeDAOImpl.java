package jsol8;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class EmployeeDAOImpl implements EmployeeDAO{
private SimpleJdbcInsert simple;
	public void setDataSource(DataSource datasource) {
		this.simple=new SimpleJdbcInsert(datasource).withTableName("EmployeeDetail");
	}
	public void insert(EmployeeDetail employee) {
		// TODO Auto-generated method stub
		Map<String,Object> para=new HashMap<String,Object>(6);
		para.put("Id", employee.getEmp_id());
		para.put("Name", employee.getName());
		para.put("Age", employee.getAge());
		para.put("Designation", employee.getDesignation());
		para.put("Dept_code", employee.getDept_code());
		para.put("Manager", employee.getManager());
		simple.execute(para);
	}

}
