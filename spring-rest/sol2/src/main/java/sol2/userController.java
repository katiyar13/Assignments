package sol2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class userController {
	User us=new User();
	
	@RequestMapping(path = "/check/{user}:{password}")
    public String authenticateUser(@PathVariable String user , @PathVariable String password)
    {
        if(us.checkList.get(user).equals(password))
        	return("Valid user");
        return("Invalid user");
    }
	}
