package sol1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
@RequestMapping(path="/hello",method=RequestMethod.GET)
public String show(){
	return "Hello_World";
}
}
