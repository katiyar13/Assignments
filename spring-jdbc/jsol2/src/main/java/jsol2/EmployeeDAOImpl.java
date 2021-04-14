package jsol2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

public class EmployeeDAOImpl extends NamedParameterJdbcDaoSupport implements EmployeeDAO{

	public void insert(EmployeeDetail employee) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO EMPLOYEEDETAIL"+
				"(EMP_ID ,NAME,AGE,DESIGNATION,DEPT_CODE,MANAGER) VALUES(:emp_id,:name,:age,:designation,:dept_code,:manager)";
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("employeeId", employee.getEmp_id());
		map.put("name", employee.getName());
		map.put("age", employee.getAge());
		map.put("designation", employee.getDesignation());
		map.put("dept_code", employee.getDept_code());
		map.put("manager", employee.getManager());
	getNamedParameterJdbcTemplate().update(sql, map);	
	}

}
