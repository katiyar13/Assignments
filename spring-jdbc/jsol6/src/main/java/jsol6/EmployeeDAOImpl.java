package jsol6;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class EmployeeDAOImpl extends JdbcDaoSupport implements EmployeeDAO{

	public List<EmployeeDetail> findall() {
		// TODO Auto-generated method stub
		return getJdbcTemplate().query("SELECT * FROM EMPLOYEE", new ResultSetExtractor<List<EmployeeDetail>>() {

			public List<EmployeeDetail> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<EmployeeDetail> eList=new ArrayList<EmployeeDetail>();
				while(rs.next()) {
					EmployeeDetail e=new EmployeeDetail();
					e.setEmp_id(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setAge(rs.getInt(3));
					e.setDesignation(rs.getString(4));
					e.setDept_code(rs.getInt(5));
					e.setManager(rs.getString(6));
					eList.add(e);
				}
				return eList;
			}
		});
	}

}
