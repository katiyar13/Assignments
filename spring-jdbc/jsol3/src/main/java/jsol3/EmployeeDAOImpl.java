package jsol3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO {


	public List<EmployeeDetail> findall() {
		// TODO Auto-generated method stub
		String  sql= "SELECT * FROM EMPLOYEEDETAIL";
		List<EmployeeDetail> emplist=getJdbcTemplate().query(sql, new EmployeeRowMapper());
		
		/*List<Map<String,Object>> list=getJdbcTemplate().queryForList(sql);
		List<EmployeeDetail> emplist=new ArrayList<EmployeeDetail>();
		for(Map<String,Object> map: list) {
			EmployeeDetail employee=new EmployeeDetail();
			employee.setEmp_id(int)map.get("Employee_Id"));
			employee.setName(toString()) map.get()*/
		return emplist;
	}

}
