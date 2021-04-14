package jsol4;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO {

	public List<EmployeeDetail> findall() {
		// TODO Auto-generated method stub
		String  sql= "SELECT * FROM EMPLOYEEDETAIL";
		List<EmployeeDetail> emplist=getJdbcTemplate().query(sql, new BeanPropertyRowMapper<EmployeeDetail>(EmployeeDetail.class));
		return emplist;
	}

}
