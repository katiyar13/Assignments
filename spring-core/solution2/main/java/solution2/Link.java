package solution2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Link {
	 private List<Question> qlist;
	    private Map<String,Question> qmap;
	    private Set<Question> qset;
		
		public void setQlist(List<Question> qlist) {
			this.qlist = qlist;
		}
		public Map<String, Question> getQmap() {
			return qmap;
		}
		public void setQmap(Map<String, Question> qmap) {
			this.qmap = qmap;
		}
		public Set<Question> getQset() {
			return qset;
		}
		public void setQset(Set<Question> qset) {
			this.qset = qset;
		}
		public List<Question> getQlist() {
			// TODO Auto-generated method stub
			return qlist;
		}
		 
}
