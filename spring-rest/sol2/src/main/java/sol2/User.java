package sol2;

import java.util.HashMap;
import java.util.Map;

public class User {
public String username;
public String pass;
Map<String,String> checkList;

public User() {
	super();
	this.checkList = new HashMap<String,String>();
	checkList.put("ram123","ram");
	checkList.put("shyam123","shyam");
	checkList.put("meena123","meena");
	checkList.put("admin","admin");
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}

public Map<String, String> getCheckList() {
	return checkList;
}
public void setCheckList(Map<String, String> checkList) {
	this.checkList = checkList;
}

}
