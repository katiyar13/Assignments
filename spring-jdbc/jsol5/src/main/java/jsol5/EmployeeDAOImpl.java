package jsol5;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO{

	public EmployeeDetail findbyEmpId(int empId) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM EMPLOYEEDETAIL WHERE EMPLOYYE_ID=?";
		EmployeeDetail empdetail=getJdbcTemplate().queryForObject(sql, new Object[] {empId},new BeanPropertyRowMapper(EmployeeDetail.class));
		return empdetail;
	}

}
