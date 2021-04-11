package sol3;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
ListingDetail ld=new ListingDetail();
Map<Integer,detail> detailMap = ld.getMap();
@RequestMapping(path = "/show/{zip}")
public String authenticateUser(@PathVariable Integer zip)
{
	if(detailMap.containsKey(zip))
		return detailMap.get(zip).toString().toUpperCase();
	return "No detail found";
	
}
}
