package jsol7;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO{

	public int findtotalEmployee() {
		// TODO Auto-generated method stub
		String sql="SELECT COUNT(*) FROM EMPLOYEEDETAIL";
		int  count=getJdbcTemplate().queryForObject(sql,Integer.class);
		return count;
	}

}
