package sol3;

import java.util.HashMap;
import java.util.Map;

public class ListingDetail {
	Map<Integer,detail> map;
	
	public Map<Integer, detail> getMap() {
		return map;
	}

	public void setMap(Map<Integer, detail> map) {
		this.map = map;
	}

	public ListingDetail() {
		map=new HashMap<Integer,detail>();
		map.put(200233, new detail("Uttar Pradesh", "Bareilly", "India"));
		map.put(324594, new detail("Uttar Pradesh", "Lucknow", "India"));
		map.put(205678, new detail("New York city", "New York", "USA"));
	}

}
