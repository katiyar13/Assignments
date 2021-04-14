package jsol3;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<EmployeeDetail> {

	public EmployeeDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeDetail emp=new EmployeeDetail();
		emp.setEmp_id(rs.getInt("Employee_Id"));
		emp.setName(rs.getString("Name"));
		emp.setAge(rs.getInt("Age"));
		emp.setDesignation(rs.getString("Designation"));
		emp.setDept_code(rs.getInt("Dept_code"));
		emp.setManager(rs.getString("Manager"));
		return emp;
	}

}
