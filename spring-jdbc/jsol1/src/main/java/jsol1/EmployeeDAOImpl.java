package jsol1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO{

	public void insert(EmployeeDetail employee) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO EMPLOYEEDETAIL"+
		"(EMP_ID ,NAME,AGE,DESIGNATION,DEPT_CODE,MANAGER) VALUES(?,?,?,?,?,?)";
		getJdbcTemplate().update(sql,new Object[] {employee.getEmp_id(),employee.getName(),employee.getAge(),
				employee.getDesignation(),employee.getDept_code(),employee.getManager()
		});
		
	}

}
